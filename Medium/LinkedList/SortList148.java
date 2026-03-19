package LinkedList;

import java.util.List;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
public class SortList148 {
    ListNode tail = null;

    ListNode insert(ListNode head, int val) {
        ListNode newnode = new ListNode(val);
        if (head == null) {
            tail = head = newnode;
        } else {
            tail.next = newnode;
            tail = tail.next;
        }
        return head;
    }
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;

        boolean swapped;
        do {
            swapped = false;
            ListNode temp = head;
            while (temp != null && temp.next != null) {
                if (temp.val > temp.next.val) {
                    int num = temp.val;
                    temp.val = temp.next.val;
                    temp.next.val = num;
                    swapped = true;
                }
                temp = temp.next;
            }
        } while (swapped);

        return head;
    }
        public ListNode sortList1(ListNode head) {
            if (head == null || head.next == null) return head;
    
            ListNode mid = getMid(head);
            ListNode left = sortList(head);
            ListNode right = sortList(mid);
    
            return merge(left, right);
        }
    
        private ListNode getMid(ListNode head) {
            ListNode slow = head, fast = head, prev = null;
            while (fast != null && fast.next != null) {
                prev = slow;
                slow = slow.next;
                fast = fast.next.next;
            }
            if (prev != null) prev.next = null;
            return slow;
        }
    
        private ListNode merge(ListNode l1, ListNode l2) {
            ListNode dummy = new ListNode(0), tail = dummy;
            while (l1 != null && l2 != null) {
                if (l1.val < l2.val) {
                    tail.next = l1;
                    l1 = l1.next;
                } else {
                    tail.next = l2;
                    l2 = l2.next;
                }
                tail = tail.next;
            }
            tail.next = (l1 != null) ? l1 : l2;
            return dummy.next;
        }
    
    
    public static void main(String[] args) {
        ListNode head=null;
        SortList148 aa=new SortList148();
        head=aa.insert(head,4);
        head=aa.insert(head,2);
        head=aa.insert(head,1);
        head=aa.insert(head,3);
        head=aa.sortList(head);

        
    }
}
