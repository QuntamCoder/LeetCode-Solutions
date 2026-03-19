package LinkedList;

public class DeleteNoode237 {
    public static void deleteNode(ListNode node) {
        ListNode temp=null;
        temp=node.next;
        node.val=temp.val;
        node.next=temp.next;
    }
}
