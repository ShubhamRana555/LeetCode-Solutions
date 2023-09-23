class Solution {
    public int trap(int[] height) {
        int lsm[] = new int[height.length];
        int rsm[] = new int[height.length];
        int n = height.length;

        //finding left maximum throughout array
        lsm[0] = height[0];
        for(int i=1;i<height.length;i++){
            lsm[i] = Math.max(height[i],lsm[i-1]);
        }

        //finding right maximum throughout array
        rsm[n-1] = height[n-1];
        for(int i=n-2;i>=0;i--){
            rsm[i] = Math.max(height[i],rsm[i+1]);
        }
        int maxWater = 0;
        int waterLevel = 0;
        for(int i=0;i<height.length;i++){
            waterLevel = Math.min(lsm[i],rsm[i]);
            int currWater = waterLevel - height[i];

            maxWater += currWater;
        }
        return maxWater;




    }
}