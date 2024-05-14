class Solution {
    public int longestMountain(int[] arr) {
        int max = 0;
        int n = arr.length;
        for(int i=1; i<n-1; i++){
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                // peak detected --> now traverse to left and right of it
                int left = i-1, right = i+1;
                while(left > 0 && arr[left] > arr[left-1]){
                    left--;
                }

                while(right < n-1 && arr[right] > arr[right+1]){
                    right++;
                }
                int mountainLength = right - left + 1;
                if(mountainLength >= 3){
                    max = Math.max(max, mountainLength);

                }
                // i = right; // move i to the right of mountain
            }
        }
        return max;

    }
}