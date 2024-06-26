class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean increase = true;
        boolean decrease = true;
        for(int i=0; i<nums.length-1; i++){
            if((nums[i] > nums[i+1])){
                increase = false;
            }
        }
        for(int i=0; i<nums.length-1; i++){
            if((nums[i] < nums[i+1])){
                decrease = false;
            }
        }

        if(!increase && !decrease){
            return false;
        }
        return true;
    }
}