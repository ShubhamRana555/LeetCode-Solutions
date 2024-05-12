class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int ptr1 = 0, ptr2 = 0;
        
        for(int i = 0; i < n; i++) {
            int count = 1;
            ptr2 = i;
            // Count the number of repeated characters
            while(i < n - 1 && chars[i] == chars[i + 1]) {
                count++;
                i++;
            }
            // Copy the character
            chars[ptr1++] = chars[ptr2];
            // If count > 1, convert count to characters
            if(count > 1) {
                String countStr = String.valueOf(count);
                for(char c : countStr.toCharArray()) {
                    chars[ptr1++] = c;
                }
            }
        }
        return ptr1; // Return the length of the compressed array
    }
}
