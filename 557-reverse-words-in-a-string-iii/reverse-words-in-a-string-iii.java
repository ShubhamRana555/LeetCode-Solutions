class Solution {
    public String reverseWords(String s) {
        String res = "";
        String temp = "";
        int n = s.length();
        for(int i = 0; i < n; i++) {
            if(s.charAt(i) == ' ') {
                res += reverse(temp);
                res += ' ';
                temp = ""; // empty temp for new string
            } else {
                temp += s.charAt(i);
            }
        }
        res += reverse(temp); // Reverse the last word
        return res;
    }

    private String reverse(String s) {
        String helper = "";
        for(int i = s.length() - 1; i >= 0; i--) {
            helper += s.charAt(i);
        }
        return helper;
    }
}
