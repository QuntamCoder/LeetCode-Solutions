package LinkedList;

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

public class Palindrome_234 {
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

    public boolean isPalindrome(ListNode head) {
        int size = 0;
        ListNode temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }

        int[] arr = new int[size];
        temp = head;
        int i = 0;
        while (temp != null) {
            arr[i++] = temp.val;
            temp = temp.next;
        }
        int[] arr2=new int[size];
        int c=0;
        for(int k:arr){
            arr2[c]=k;
            c++;
        }
           boolean flag=false;
           int cnt=0;
        for (int j = arr2.length-1; j >=0; j--) {
            if(arr[cnt]==arr2[j]){
                flag=true;
                cnt++;
            }else{
                flag=false;
                break;
            }
        }

        return flag;
    }

    public static void main(String[] args) {
        Palindrome_234 aa = new Palindrome_234();
        ListNode head = null;
        head = aa.insert(head, 5);
        head = aa.insert(head, 5);
        head = aa.insert(head,5);
        head = aa.insert(head, 5);
        boolean res=aa.isPalindrome(head);
        System.out.println(res);
    }
}
