class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int res[] = new int[n];
        Arrays.fill(res, 0);
        int count = 0, product = 1;

        for(int i=0; i<n; i++){
            if(nums[i] == 0){
                count++;
            }
            else{
                product *= nums[i];
            }
        }

        if(count >= 2){
            // more than 2 zeroes will result an entire empty array
            return res;
        }
        else if(count == 1){
            for(int i=0; i<n; i++){
                if(nums[i] == 0){
                    res[i] = product;
                }
                else{
                    res[i] = 0;
                }
            }
        }
        else{
            for(int i=0; i<n; i++){
                res[i] = product/nums[i];
            }
        }
        return res;
    }
}