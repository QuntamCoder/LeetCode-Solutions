package LinkedList;

import java.util.Stack;

public class Convertbinary1290 {
    class Solution {
        public int getDecimalValue(ListNode head) {
            Stack<Integer> stack=new Stack<>();
            int dec=0,base=1;
            if(head.next==null){
                if(head.val==0){
                    return 0;
                }
            }
            ListNode temp=head;
            while (temp!=null) {
                stack.push(temp.val);
                temp=temp.next;
            }
            while (!stack.isEmpty()) {
                if(stack.pop()==1){
                    dec+=base;
                }
                base*=2;
            }
            return dec;
        }
    }
}
