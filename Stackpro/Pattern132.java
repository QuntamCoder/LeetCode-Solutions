package Stackpro;
import java.util.Collection;
import java.util.Stack;

import javax.swing.text.StyledEditorKit.BoldAction;
public class Pattern132 {
    public boolean find132pattern(int[] nums) {
        if(nums.length<3){
            return false;
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] < nums[k] && nums[j] < nums[k]) {
                        return true;
                    }
                }
            }
        }
    
            
        
        return false;
    }
    public boolean increasingTriplet(int[] nums) {
        if(nums.length<3){
    return false;
}
        int first = Integer.MAX_VALUE;
int second = Integer.MAX_VALUE;

for (int n : nums) {
    if (n <= first) {
        first = n;
    } else if (n <= second) {
        second = n;
    } else {
        return true; 
    }
}

return false;
}

public boolean find132pattern1(int[] nums) {
    if (nums.length < 3) return false;
    
    int third = Integer.MIN_VALUE;
    // Stack<Integer> stack = new Stack<>();
    Stack<Integer> stack=new Stack<>();

    for (int i = nums.length - 1; i >= 0; i--) {
        if (nums[i] < third) {
            return true;
        }
       
        while (!stack.isEmpty() && nums[i] > stack.peek()) {
            third = stack.pop();
        }
        
        stack.push(nums[i]);
    }
    
    return false;
}
public static void main(String[] args) {
    Pattern132 aa=new Pattern132();
    int arr[]={1,2,3,4};
    Boolean res=aa.increasingTriplet(arr);
    System.out.println(res);
}
}