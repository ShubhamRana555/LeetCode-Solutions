class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = findFirstOrLast(nums, target, true);
        int last = findFirstOrLast(nums, target, false);
        
        return new int[] {first, last};
    }
    
    private int findFirstOrLast(int[] nums, int target, boolean isFirst) {
        int index = -1;
        int low = 0;
        int high = nums.length - 1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                index = mid;
                if (isFirst)
                    high = mid - 1; // Continue searching on the left side for the first occurrence.
                else
                    low = mid + 1; // Continue searching on the right side for the last occurrence.
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        return index;
    }
}
