package LinkedList;

import java.util.Stack;

public class AdditionTwoLinkList445 {

    ListNode tail = null;
    ListNode head = null;

    void insert(int val) {
        ListNode newNode = new ListNode(val);
        if (head == null) {
            head = tail = newNode;  
        } else {
            tail.next = newNode;    
            tail = tail.next;      
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        while (l1 != null) {
            s1.push(l1.val);
            l1 = l1.next;
        }

        while (l2 != null) {
            s2.push(l2.val);
            l2 = l2.next;
        }

        ListNode head = null;
        int carry = 0;

        while (!s1.isEmpty() || !s2.isEmpty() || carry != 0) {
            int sum = carry;
            if (!s1.isEmpty()) sum += s1.pop();
            if (!s2.isEmpty()) sum += s2.pop();

            ListNode newNode = new ListNode(sum % 10);
            newNode.next = head;
            head = newNode;

            carry = sum / 10; 
        }

        return head;  
    }

    public void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        AdditionTwoLinkList445 l1 = new AdditionTwoLinkList445();
        AdditionTwoLinkList445 l2 = new AdditionTwoLinkList445();

        l1.insert(7);
        l1.insert(2);
        l1.insert(4);
        l1.insert(3);

        l2.insert(5);
        l2.insert(6);
        l2.insert(4);

        ListNode result = l1.addTwoNumbers(l1.head, l2.head);

        System.out.print("Result: ");
        l1.printList(result);
    }
}

// ListNode class to represent a node in the linked list
