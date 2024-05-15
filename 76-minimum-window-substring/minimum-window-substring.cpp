class Solution {
public:
    string minWindow(string s, string t) {
        if (s.empty() || t.empty()) return "";
        
        // Frequency maps for characters in t and in the current window of s
        unordered_map<char, int> t_freq, window_freq;
        
        // Fill the frequency map for t
        for (char c : t) t_freq[c]++;
        
        int have = 0, need = t_freq.size();
        int left = 0, right = 0, min_len = INT_MAX;
        int min_left = 0, min_right = 0;
        
        while (right < s.size()) {
            char c = s[right];
            window_freq[c]++;
            
            if (t_freq.count(c) && window_freq[c] == t_freq[c]) {
                have++;
            }
            
            while (have == need) {
                // Update the minimum window size if found a smaller window
                if (right - left + 1 < min_len) {
                    min_len = right - left + 1;
                    min_left = left;
                    min_right = right;
                }
                
                // Contract the window from the left
                char left_char = s[left];
                window_freq[left_char]--;
                if (t_freq.count(left_char) && window_freq[left_char] < t_freq[left_char]) {
                    have--;
                }
                left++;
            }
            
            right++;
        }
        
        return min_len == INT_MAX ? "" : s.substr(min_left, min_len);
    }
};
