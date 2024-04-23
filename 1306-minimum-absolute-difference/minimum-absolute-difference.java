class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++){
            int diff = Math.abs(arr[i+1]-arr[i]);
            min = Math.min(min, diff);
        }

        for(int i=0; i<arr.length-1; i++){
            // List<Integer> ls = new ArrayList<>();
            if(Math.abs(arr[i+1]-arr[i]) == min){
                // ls.add(arr[i]);
                // ls.add(arr[i+1]);
                result.add(Arrays.asList(arr[i],arr[i+1]));

            }
        }
        return result;
    }
}