package LinkedList;

public class RotateLinkedList61 {
    public ListNode rotateRight(ListNode head, int k) {

        if(head==null|| head.next==null){
            return null;
        }
        int length = 0;
        ListNode flag = head;

        while (flag != null) {
            length++;
            flag = flag.next;
        }

        k = k % length;
        if (k == 0) return head;


        ListNode temp=null,prev=null;
        for (int i = 1; i <=k; i++) {
            temp=head;
            while(temp!=null){
                prev=temp;
                temp=temp.next;
            }
            prev.next=null;
            temp.next=head;
            head=temp;
        }
        
        return head;
    } 
}
