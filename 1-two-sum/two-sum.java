class Solution {
    public int[] twoSum(int[] nums, int target) {
        int []res = new int[2];
        int n = nums.length,p = 0, q = n-1;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<n;i++){
            if(map.containsKey(target - nums[i])){
                res[0] = map.get(target - nums[i]);    
                res[1] = i;
            }
            map.put(nums[i],i);
        }
        return res;
    }
}