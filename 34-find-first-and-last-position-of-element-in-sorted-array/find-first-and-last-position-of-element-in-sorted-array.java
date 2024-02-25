class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length == 0 || nums[0] > target || nums[nums.length - 1] < target)
            return new int[]{ -1, -1};
        
        
        int minIdx = binarySearch(nums, target);
        
        if(nums[minIdx+1] != target)
            return new int[]{ -1, -1};
        
        int maxIdx = binarySearch(nums, target+1);
        return new int[]{minIdx+1, maxIdx};
    }
    public int binarySearch(int[] nums, int target){ // find >= target i.e < target
        int left = 0; 
        int right = nums.length - 1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid] < target){
                left = mid + 1;
            }
            else if(nums[mid] >= target){
                right = mid - 1;
            }
        }
        return right;
    }
}