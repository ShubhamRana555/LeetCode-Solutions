class Solution {
    public int climbStairs(int n) {
        ArrayList<Integer>dp = new ArrayList(Collections.nCopies(n+1,-1));
        return helper(n,dp);
    }
    private int helper(int n,ArrayList<Integer>dp){
        if(n<0)
        return 0;
        if(n == 0 || n==1){
            return 1;
        }
        if(dp.get(n) != -1) return dp.get(n);
        int w1 = helper(n-1,dp);
        int w2 = helper(n-2,dp);
        dp.set(n,w1+w2);
        return dp.get(n);
    }
}