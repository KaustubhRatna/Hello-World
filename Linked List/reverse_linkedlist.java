class Node
{
    int data;
    Node next;
    Node(int x)
    {
        data=x;
        next=null;
    }
}

public class reverse_linkedlist
 {
    public static void display(Node head)
    {
        while(head!=null)
        {
        System.out.print(head.data+"->");   
        head=head.next;
        }
        System.out.println();
    }
    public static Node reverseList(Node head)
    {
     Node curr = head.next;
     Node prev=head;
     prev.next=null;
     while(curr!=null)
     {
         Node temp=curr.next;
         curr.next=prev;
         prev=curr;
         curr=temp;
     }
     return prev;
    }
    public static void main(String[] args) 
    {
        Node head=new Node(1);
        Node t1=new Node(2);
        Node t2=new Node(3);
        head.next=t1;
        t1.next=t2;
        display(head);
        head=reverseList(head);
        display(head);
    }
}
