class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }

}

public class LinkedListImplementation {
    Node head=null;
    Node tail=null;
    void insertAtLast(int data){
        Node temp=new Node(data);
        if(head==null){
            head=temp;
        }else{
           tail.next=temp;
        }
        tail=temp;
    }
    void insertAtFirst(int data){
        Node temp=new Node(data);
        if(head==null){
            head=temp;
            tail=temp;
        }else{
          temp.next=head;
          head=temp;
        }
    }


    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
    }
    void size(){
        Node temp=head;
        int count=0;
        while(temp!=null){
              count++;
              temp=temp.next;

        }
        System.out.println("the size of linkedlist is"+count);
    }

    Node printSecond(){
        Node temp=head;
        Node fact=temp;
        while(temp.next!=null){
            fact=temp;
            temp=temp.next;
        }
        fact.next=temp;
        System.out.println();   
        return head;    // System.out.println(fact.data);
    }
    public static void main(String args[]){
        LinkedListImplementation linklist=new LinkedListImplementation();
        linklist.insertAtFirst(10);
        linklist.insertAtFirst(11);
        linklist.insertAtFirst(12);
        linklist.insertAtFirst(13);

        linklist.display();;
        // linklist.printSecond();
        // linklist.display();;
        linklist.size();

    }
}
