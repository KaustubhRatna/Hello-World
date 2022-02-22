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
public class reverse_LL_recursive_1 
{   
    public static Node reverse(Node head)
    {
        if(head==null||head.next==null)
        return head;
        Node rest_head=reverse(head.next);
        Node rest_tail=head.next;
        rest_tail.next=head;
        head.next=null;
        return rest_head;
            
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
        head.next.next=new Node(30);
        display(head);
        head=reverse(head);
        display(head);
    }
}
