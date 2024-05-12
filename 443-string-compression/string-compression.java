class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int ptr1 = 0, ptr2 = 0;
        
        for(int i = 0; i < n; i++) {
            Integer count = 1; // Using Integer instead of int
            ptr2 = i;
            while(i < n - 1 && chars[i] == chars[i + 1]) {
                count++;
                i++;
            }
            chars[ptr1++] = chars[ptr2];
            if(count > 1) {
                String countStr = count.toString(); // Convert Integer to String
                for(char c : countStr.toCharArray()) {
                    chars[ptr1++] = c;
                }
            }
        }
        return ptr1;
    }
}
