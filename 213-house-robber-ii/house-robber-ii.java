class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        // arraylist for helper function to eliminate TLE
        ArrayList<Integer> res = new ArrayList<>(Collections.nCopies(n-1,-1));
        
        if(nums.length < 2){
            return nums[0];
        }

        int skipLastHouse[] = new int[nums.length - 1]; 
        int skipFirstHouse[] = new int[nums.length - 1];

        for(int i=0; i<nums.length-1; i++){
            skipLastHouse[i] = nums[i];
            skipFirstHouse[i] = nums[i+1];
        }

        // Get loot from both possibilites
        int lootSkippingLast = helper(skipLastHouse, skipLastHouse.length, res);
        int lootSkippingFirst = helper(skipFirstHouse, skipFirstHouse.length, res);

        return Math.max(lootSkippingFirst, lootSkippingLast);
    }
    private int helper(int nums[], int n, ArrayList<Integer> dp){
        if(n < 2){
            return nums[0];
        }
        dp.set(0, nums[0]);
        dp.set(1, Math.max(nums[0],nums[1]));

        for(int i=2; i<n; i++){
            int nMinus2 = dp.get(i-2);
            int nMinus1 = dp.get(i-1);
            dp.set(i, Math.max(nMinus2 + nums[i], nMinus1));
        }
        return dp.get(n-1);
    }
}