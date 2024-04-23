import java.util.*;

class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        
        for (int i = 0; i < arr.length - 1; i++) {
            int diff = Math.abs(arr[i + 1] - arr[i]);
            min = Math.min(min, diff);
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if (Math.abs(arr[i + 1] - arr[i]) == min) {
                List<Integer> ls = new ArrayList<>();
                ls.add(arr[i]);
                ls.add(arr[i + 1]);
                result.add(ls);
            }
        }
        
        return result;
    }
}
