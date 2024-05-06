class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums==null || nums.length < 3){
            return new ArrayList<>();
        }
        Set<List<Integer>> res = new HashSet<>();
        int n = nums.length;

        Arrays.sort(nums);
        for(int i=0; i<n-2; i++){
            int start = i + 1;
            int end = n - 1;
            while(start < end){
                int sum = nums[i]+nums[start]+nums[end];
                if(sum == 0){
                    ArrayList<Integer> arr = new ArrayList<>();
                    arr.add(nums[i]);
                    arr.add(nums[start]);
                    arr.add(nums[end]);
                    res.add(arr); 
                    start++;
                    end--;   
                }
                else if(sum < 0){
                    start++;
                }
                else{
                    end--;
                }
            }
        }
        return new ArrayList<>(res);
    }
}