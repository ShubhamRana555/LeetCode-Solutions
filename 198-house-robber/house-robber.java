class Solution {
    public int rob(int[] nums) {
        int n= nums.length;
        ArrayList<Integer> res = new ArrayList<>(Collections.nCopies(n+1,-1));
        return helper(nums,n,res);
    }
    private int helper(int []nums, int n,ArrayList<Integer> dp){
        if(n <= 0){
            return 0;
        }
        if(dp.get(n) != -1){
            return dp.get(n);
        }
        int pick = nums[n-1] + helper(nums,n-2,dp);
        int notPick = helper(nums,n-1,dp);
        dp.set(n,Math.max(pick,notPick));
        return dp.get(n);
    }
}