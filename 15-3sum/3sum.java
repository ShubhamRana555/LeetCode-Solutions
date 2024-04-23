class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();

        if (nums==null && nums.length<3){
            return new ArrayList<>();
        }

        Arrays.sort(nums);
        for(int i=0; i<nums.length-2; i++){
            int left = i+1;
            int right = nums.length-1;

            while(left < right){
                int sum = nums[i]+nums[left]+nums[right];
                if(sum == 0){
                    List<Integer> arr = new ArrayList<>();

                    arr.add(nums[i]);
                    arr.add(nums[left]);
                    arr.add(nums[right]);
                    result.add(arr);
                    left++;
                    right--;
                }
                else if(sum < 0){
                    left++;
                }
                else right--;

            }
        }
        return new ArrayList<>(result);

    }
}