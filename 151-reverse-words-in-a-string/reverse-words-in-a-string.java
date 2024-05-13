class Solution {
    public String reverseWords(String s) {
        // Remove leading and trailing whitespaces and split the string by one or more whitespaces
        String[] words = s.trim().split("\s+");
        
        // Reverse the order of words
        int i = 0, j = words.length - 1;
        while (i < j) {
            String temp = words[i];
            words[i] = words[j];
            words[j] = temp;
            i++;
            j--;
        }
        
        // Join the reversed words with a single whitespace between them
        return String.join(" ", words);
    }
}
