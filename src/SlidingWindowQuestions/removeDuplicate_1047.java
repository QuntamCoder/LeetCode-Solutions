package SlidingWindowQuestions;

import java.util.Stack;

public class removeDuplicate_1047{
    public static String removeDuplicates(String s) {
        Stack<Character> ss = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (!ss.isEmpty() && ss.peek() == s.charAt(i)) {
                ss.pop();
            } else {
                ss.push(s.charAt(i));
            }
        }

        StringBuilder res = new StringBuilder();
        while (!ss.isEmpty()) {
            res.append(ss.pop());
        }

        return res.reverse().toString();
    }

    public static void main(String args[]){

    }
}