class Solution {
    public boolean isPowerOfFour(int n) {
        if(n <= 0){
            return false;
        }
        if((n & (n-1)) != 0){
            return false;
        }
        int countZeros = 0;
        while((n&1) == 0){
            countZeros++;
            n >>= 1;
        }

        return countZeros%2 == 0;
    }
}