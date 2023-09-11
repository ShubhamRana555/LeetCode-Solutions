class Solution {
    public int[][] merge(int[][] intervals) {
        
        Arrays.sort(intervals, (a,b) -> a[0]-b[0]);

        List<int[]> ls = new ArrayList<>();

        int[] currInterval = intervals[0];

        for(int i=1;i<intervals.length;i++){
            int[] nextInterval = intervals[i];
            
            if(nextInterval[0] <= currInterval[1] ){
                //overlapping
                currInterval[1] = Math.max(currInterval[1],nextInterval[1]);
            }
            else{
                ls.add(currInterval);
                currInterval = nextInterval;
            }
        }
        //adding last interval
        ls.add(currInterval);

        return ls.toArray(new int[ls.size()][]);




    }
}