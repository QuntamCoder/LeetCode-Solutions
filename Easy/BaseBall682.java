package Easy;

import java.util.Stack;

public class BaseBall682{
    public int calPoints(String[] operations) {
        Stack<Integer> stack=new Stack<>();
        for (String s:operations) {
            if(s.equals("C")){
                stack.pop();
            }else if(s.equals("D")){
                stack.push(2*stack.peek());
            }else if(s.equals("+")){
                int last=stack.pop();
                int newlast=last+stack.peek();
                stack.push(last);
                stack.push(newlast);

            }else{
                stack.push(Integer.parseInt(s));
            }
        }
        int score=0;
        for (Integer integer : stack) {
            score+=integer;
        }
        return score;
    }
    public static void main(String[] args) {
        BaseBall682 aa=new BaseBall682();
        String str[]={"5","2","C","D","+"};
        int res=aa.calPoints(str);
        System.out.println(res);
    }
}