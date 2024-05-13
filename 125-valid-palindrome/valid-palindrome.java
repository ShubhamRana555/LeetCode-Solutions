class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder str1 = new StringBuilder("");

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                str1.append(s.charAt(i));

            }
            if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                str1.append(Character.toLowerCase(s.charAt(i)));

            }
            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                str1.append(s.charAt(i));

            }
        }
        int n = str1.length();
        int start = 0, end = n-1;
        while(start<=end){
            if(str1.charAt(start) != str1.charAt(end)){
                return false;
            }
            else{
                start++;
                end--;
            }
        }
        return true;
        
    }
}