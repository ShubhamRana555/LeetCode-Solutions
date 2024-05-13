import java.util.HashMap;

class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        
        // Count occurrences of each character
        for (int i = 0; i < s.length(); i++) {
            char key = s.charAt(i);
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        
        // Find the first non-repeating character
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        
        // If no unique character found, return -1
        return -1;
    }
}
