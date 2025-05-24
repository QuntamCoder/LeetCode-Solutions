package SlidingWindowQuestions;

import java.util.ArrayList;
import java.util.List;

public class Build_array_stack {
    public List<String> buildArray(int[] target, int n) {
        List<String> operations = new ArrayList<>();
        int targetInd = 0;
        int currentNum = 1;
        
        while (targetInd < target.length && currentNum <= n) {
            if (target[targetInd] == currentNum) {
                operations.add("Push");
                targetInd++;
            } else {
                operations.add("Push");
                operations.add("Pop");
            }
            currentNum++;
        }
        
        return operations;
    }
    public static void main(String[] args) {
        
    }
    }


