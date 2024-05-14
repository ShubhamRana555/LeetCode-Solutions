import java.util.HashMap;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();
        String[] words = s.split("\\s+");
        
        if (pattern.length() != words.length) {
            return false; // Different number of characters and words
        }
        
        for (int i = 0; i < pattern.length(); i++) {
            char key = pattern.charAt(i);
            String word = words[i];
            
            if (!map.containsKey(key)) {
                if (map.containsValue(word)) {
                    return false; // Pattern character maps to different word
                }
                map.put(key, word);
            } else {
                if (!map.get(key).equals(word)) {
                    return false; // Pattern character maps to different word
                }
            }
        }
        
        return true;
    }
}
