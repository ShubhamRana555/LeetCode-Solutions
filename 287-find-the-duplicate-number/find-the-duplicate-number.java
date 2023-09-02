class Solution {
    public int findDuplicate(int[] nums) {
        // Linked List Cycle Method
        int n = nums.length;
        int slow = nums[0];
        int fast = nums[0];

        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(slow != fast);

        fast = nums[0];

        while(fast != slow){
            slow = nums[slow];
            fast = nums[fast];
        }

        return fast;
    }
}