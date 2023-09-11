class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length <= 1) {
            return intervals;
        }
        
        // Sort intervals by their start times
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        
        List<int[]> result = new ArrayList<>();
        int[] currentInterval = intervals[0];
        
        for (int i = 1; i < intervals.length; i++) {
            int[] nextInterval = intervals[i];
            
            // Check if the current interval overlaps with the next interval
            if (currentInterval[1] >= nextInterval[0]) {
                // Merge the intervals
                currentInterval[1] = Math.max(currentInterval[1], nextInterval[1]);
            } else {
                // Add the current interval to the result and update the current interval
                result.add(currentInterval);
                currentInterval = nextInterval;
            }
        }
        
        // Add the last interval to the result
        result.add(currentInterval);
        
        // Convert the result list to an array
        return result.toArray(new int[result.size()][]);
    }
}