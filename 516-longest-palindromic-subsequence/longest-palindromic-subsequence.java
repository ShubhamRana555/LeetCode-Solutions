class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length(), n = text2.length();
        
        // Initialize the dp array
        ArrayList<ArrayList<Integer>> dp = new ArrayList<>();
        for (int i = 0; i <= m; i++) {
            ArrayList<Integer> row = new ArrayList<>(Collections.nCopies(n + 1, 0));
            dp.add(row);
        }
        
        // Fill the dp array
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    dp.get(i).set(j, dp.get(i - 1).get(j - 1) + 1);
                } else {
                    dp.get(i).set(j, Math.max(dp.get(i - 1).get(j), dp.get(i).get(j - 1)));
                }
            }
        }
        
        // Return the result
        return dp.get(m).get(n);
    }
    public int longestPalindromeSubseq(String s) {
        String originalString = "hello";
        StringBuilder reversedString = new StringBuilder(s);
        reversedString.reverse();
        return longestCommonSubsequence(s,reversedString.toString());
    }

}