package SlidingWindowQuestions;

import java.util.Stack;

public class Validate_Stack_Sequences {
    public static void main(String[] args) {
            Stack<Integer> stack = new Stack<>();
    int popIndex = 0;
    
    for (int num : pushed) {
        stack.push(num);  
        
        while (!stack.isEmpty() && stack.peek() == popped[popIndex]) {
            stack.pop();
            popIndex++;
        }
    }
    
    return stack.isEmpty();

    }
}
