package Medium;

 class Node{
    public int val;
     Node next;

    Node(int val){
        this.val=val;
    }
}
public class SwapNodes24 {

     void   swpaNode(Node head){
        // if(head==null ){
            
        //     head;
        // }
        Node temp=head;
        while (temp.next.next!=null) {
            int tem=temp.val;
            temp.val=temp.next.val;
             temp.next.val=tem;
             temp=temp.next.next;
        }
     
        while(head!=null){
            System.out.println(head.val);
            head=head.next;
        }

    }
    public static void main(String[] args) {
   

    Node n1=new Node(1);
    Node n2=new Node(2);
        Node n3=new Node(3);
    Node n4=new Node(4);

    n1.next=n2;
    n2.next=n3;
    n3.next=n4;
    n4.next=null;
    SwapNodes24 aa=new SwapNodes24();
    aa.swpaNode(n1);

    }
    
}
