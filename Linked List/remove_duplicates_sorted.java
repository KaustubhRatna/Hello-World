class Node
{
    Node next;
    int data;
    Node(int x)
    {
        data=x;
        next=null;
    }
}
public class remove_duplicates_sorted
{   
    public static Node remove(Node head)
    {
       Node prev=head;
       Node curr=head.next;
       while(curr!=null)
       {
           if(curr.data==prev.data)
           {
               prev.next=curr.next;
               
               curr=prev.next;
           }
           else
           {
               prev=curr;
               curr=curr.next;  
           }
      
       }     
       return head;
    } 
    public static void display(Node head)
    {
        while(head.next!=null)
        {
        System.out.print(head.data+"->");
        head=head.next;
        }
        System.out.println(head.data);
    }
    public static void main(String[] args)
     {
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(20);
        head.next.next.next=new Node(30);
        head.next.next.next.next=new Node(30);
        head.next.next.next.next.next=new Node(30);
        head.next.next.next.next.next.next=new Node(40);
        display(head);
        head=remove(head);
        display(head);
    }
}
