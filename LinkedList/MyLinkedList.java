package LinkedList;

class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class MyLinkedList {
    ListNode head;
    ListNode tail;

    public MyLinkedList() {
        head = null;
        tail = null;
    }

    public int get(int index) {
        int i = 0;
        ListNode temp = head;
        while (i < index) {
            if (temp == null) {
                return -1;
            }
            temp = temp.next;
            i++;
        }
        return (temp != null) ? temp.val : -1;
    }

    public void addAtHead(int val) {
        ListNode newNode = new ListNode(val);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void addAtTail(int val) {
        ListNode newNode = new ListNode(val);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = tail.next;
        }
    }

    public void addAtIndex(int index, int val) {
        if (index == 0) {
            addAtHead(val);
            return;
        }

        int i = 0;
        ListNode temp = head;
        while (temp != null && i < index - 1) {
            temp = temp.next;
            i++;
        }

        if (temp == null) {
            return;
        }

        ListNode newNode = new ListNode(val);
        newNode.next = temp.next;
        temp.next = newNode;

        if (newNode.next == null) {
            tail = newNode;
        }
    }

    public void deleteAtIndex(int index) {
        if (head == null) return;

        if (index == 0) {
            head = head.next;
            if (head == null) tail = null;
            return;
        }

        int i = 0;
        ListNode temp = head;
        while (temp != null && i < index - 1) {
            temp = temp.next;
            i++;
        }

        if (temp == null || temp.next == null) return;

        if (temp.next == tail) {
            tail = temp;
        }

        temp.next = temp.next.next;
    }
    public static void main(String[] args) {
        Convertbinary1290 aa=new Convertbinary1290();
    }
}
