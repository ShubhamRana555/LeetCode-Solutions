class Solution {
    public int maxFrequencyElements(int[] nums) {
        TreeMap<Integer,Integer> map = new TreeMap<>(Comparator.reverseOrder());
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int curr = 0;
        
        // Count the frequency of each element
        for(int i = 0; i < n; i++) {
            if(map.containsKey(nums[i])){
                curr = map.get(nums[i]) + 1;
                map.put(nums[i], curr);
                max = Math.max(max,curr);
            }
            else{
                curr = 1;
                map.put(nums[i], curr);
                max = Math.max(curr,max);
            }
        }

        int res = 0;
        // Count the elements with maximum frequency
        for(int freq : map.values()) {
            if(freq == max) {
                res += freq;
            }
        }
        return res;
        
    }
}