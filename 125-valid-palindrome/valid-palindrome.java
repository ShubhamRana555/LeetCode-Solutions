class Solution {
    public boolean isPalindrome(String s) {
        String str="";
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z' || s.charAt(i)>='A' && s.charAt(i)<='Z'){
                str += Character.toLowerCase(s.charAt(i));
            }
            else if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                str += s.charAt(i);
            }
        }
            System.out.println(str);

        int start = 0, end = str.length()-1;
        while(start <= end){
            if(str.charAt(start) != str.charAt(end)){
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