package Medium.LinkedList;

import java.util.LinkedList;

public class GcdOfTwoNumbers {
    LinkedList<Integer> list = new LinkedList<>();
  int gcd(int a,int b){
               while (b != 0) {
                    int r = a % b;
                    a = b;
                    b = r;
                }
                return a;
        }
    public ListNode insertGreatestCommonDivisors(ListNode head) {

      
        ListNode temp = null, left = head, right = head.next;
        while (right.next != null) {
            int a = left.val;
            int b = right.val;
         
               
                temp.val = a;
                temp.next = right;
                left.next = temp;
                left = right;
                right = right.next;
            } else {
                while (a != 0) {
                    int r = b % a;
                    b = a;
                    a = r;
                }
                temp.val = a;
                temp.next = right;
                left.next = temp;
                left = right;
                right = right.next;
            }

        }
        return head;
    }
}
