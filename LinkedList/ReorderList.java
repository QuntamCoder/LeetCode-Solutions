
package LinkedList;

class NodeList{
        int val;
        NodeList next;
        NodeList() {}
        NodeList(int val) { this.val = val; }
        NodeList(int val, NodeList next) { this.val = val; this.next = next; }

}

public class ReorderList {

public void reorderList(NodeList head) {

        if (head == null || head.next == null) {
            return;
        }


        NodeList slow = head;
        NodeList fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        
        NodeList prev = null;
        NodeList current = slow.next;
        slow.next = null;  

        while (current != null) {
            NodeList temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }

     
        NodeList first = head;
        NodeList second = prev;

        while (second != null) {
            NodeList temp1 = first.next;
            NodeList temp2 = second.next;

            first.next = second;
            second.next = temp1;

            first = temp1;
            second = temp2;
        }
    }
}
