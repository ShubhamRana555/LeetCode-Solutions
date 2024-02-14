class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int pos[] = new int[n/2];
        int neg[] = new int[n/2];
        int i = 0,j = 0;
        for(int it=0;it<n;it++){
            if(nums[it] >= 0){
                pos[i++] = nums[it];
            }
            else{
                neg[j++] = nums[it];
            }
        }
        i = 0; j = 0;
        int iter = 0;
        while(i < n/2 && j < n/2){
            nums[iter++] = pos[i++];
            nums[iter++] = neg[j++];  
        } 
        return nums;
    }
}