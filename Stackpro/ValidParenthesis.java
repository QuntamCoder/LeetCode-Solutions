package Stackpro;

import java.util.Stack;

public class ValidParenthesis {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='('||c=='{'||c=='('){
                stack.push(c);
            }else {
                if (stack.isEmpty()) {
                    return false;
                }
        
                if(c=='}'&&stack.peek()=='{'||c==']'&&stack.peek()=='['||c==')'&&stack.peek()=='('){
                stack.pop();
            }else{
                return false;

            }
        }
    }
        return stack.isEmpty();
    }
public static void main(String[] args) {
    ValidParenthesis aa=new ValidParenthesis();
    System.out.println(aa.isValid("[[{}]]"));
}
}
