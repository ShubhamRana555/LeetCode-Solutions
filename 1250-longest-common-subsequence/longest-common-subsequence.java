import java.util.ArrayList;

class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length(), n = text2.length();
        
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for(int i=0;i<=m;i++){
            ArrayList<Integer> arr = new ArrayList<>(Collections.nCopies(n+1,0));
            res.add(arr);
        }

        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(text1.charAt(i-1) == text2.charAt(j-1)){
                    res.get(i).set(j, res.get(i-1).get(j-1) + 1);
                }
                else{
                    res.get(i).set(j, Math.max(res.get(i - 1).get(j), res.get(i).get(j - 1)));

                }
            }
        }
        return res.get(m).get(n);
    }
}
