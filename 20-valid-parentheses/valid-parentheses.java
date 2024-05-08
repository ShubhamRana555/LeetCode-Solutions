class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            char iter = s.charAt(i);
            if(iter == '(' || iter == '{' || iter == '[') {
                st.push(iter);
            }
            else if (!st.isEmpty()) {
                char top = st.pop();
                if ((top == '(' && iter != ')') || (top == '{' && iter != '}') || (top == '[' && iter != ']')) {
                    return false;
                }
            } else {
                return false; // Extra closing brackets
            }
        }
        return st.isEmpty(); // Check for extra opening brackets
    }
}