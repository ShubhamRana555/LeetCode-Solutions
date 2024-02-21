public class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        int n = s.length();
        int start = 0, end = 1;
        int low, hi;

        for (int i = 0; i < n; i++) {
            // for even palindromic substring
            low = i - 1;
            hi = i;
            while (low >= 0 && hi < n && s.charAt(low) == s.charAt(hi)) {
                if (hi - low + 1 > end) {
                    start = low;
                    end = hi - low + 1;
                }
                low--;
                hi++;
            }
            // for odd palindromic substring
            low = i - 1;
            hi = i + 1;
            while (low >= 0 && hi < n && s.charAt(low) == s.charAt(hi)) {
                if (hi - low + 1 > end) {
                    start = low;
                    end = hi - low + 1;
                }
                low--;
                hi++;
            }
        }

        return s.substring(start, start + end);
    }
}
