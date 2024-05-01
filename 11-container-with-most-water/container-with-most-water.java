class Solution {
    public int maxArea(int[] height) {
        int area = 0, n = height.length;
        int start = 0, end = n-1;
        int maxArea = 0;
        while(start <= end){
            int width = end - start;
            int ht = Math.min(height[start],height[end]);
            int currArea = width * ht;

            maxArea = Math.max(maxArea, currArea);
            if(height[start] <= height[end]){
                start++;
            }
            else{
                end--;
            }
        }
        return maxArea;
    }
}