class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            boolean isTrue = palindrome(words[i]);
            if(isTrue == true){
                return words[i];
            }
        }
        return "";
    }
    private boolean palindrome(String str){
        int i = 0,j = str.length()-1;
        while(i <= j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++; j--;
        }
        return true;
    }
}