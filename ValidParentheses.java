//TC: O(n)
//SC: O(n)
//approach: stack, push for opening bracket, pop for closing

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c=='(' || c=='[' || c=='{'){
                stack.push(c);
            }else{
                if(stack.isEmpty()) return false;
                if((c==')' && stack.peek() == '(') || (c==']' && stack.peek() == '[') || (c=='}' && stack.peek() == '{')){
                    stack.pop();
                }else return false;
            }
        }
        return stack.isEmpty();
    }
}
