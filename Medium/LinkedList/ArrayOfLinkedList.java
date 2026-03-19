package LinkedList;

public class ArrayOfLinkedList {
    ListNode tail = null;
    ListNode head = null;

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode prev = null, slow = head, fast = head;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;

        ListNode left = sortList(head);
        ListNode right = sortList(slow);

        ListNode dummy = new ListNode(0); 
        ListNode current = dummy;

        while (left != null && right != null) {
            if (left.val <= right.val) {
                current.next = left;
                left = left.next;
            } else {
                current.next = right;
                right = right.next;
            }
            current = current.next;
        }

        if (left != null) {
            current.next = left;
        } else {
            current.next = right;
        }

        return dummy.next;  
    }


    public  ListNode mergeKLists(ListNode[] lists){
       for (int i = 0; i < lists.length; i++) {
            ListNode list=lists[i];
            while(list!=null){
                ListNode newnode=new ListNode(list.val);
                if(head==null){
                    head=tail=newnode;
                }else{
                    tail.next=newnode;
                    tail=tail.next;

                }
                list=list.next;
            }
       }
      return sortList(head);
    //    return head;
    }

    public  void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ListNode[] lists = new ListNode[3];

        lists[0] = new ListNode(1);
        lists[0].next = new ListNode(2);
        lists[0].next.next = new ListNode(7); 

        lists[1] = new ListNode(4);
        lists[1].next = new ListNode(5); 

        lists[2] = new ListNode(6); 


        // for (int i = 0; i < lists.length; i++) {
        //     printList(lists[i]);
        // }
        ArrayOfLinkedList aa=new ArrayOfLinkedList();
    ListNode ll=aa.mergeKLists(lists);
    aa.printList(ll);
    }

    


}
