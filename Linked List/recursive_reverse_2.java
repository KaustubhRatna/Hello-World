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
public class recursive_reverse_2 
{   
    public static Node reverse(Node curr,Node prev)
    {
        if(curr==null)
        return prev;
        Node next=curr.next;
        curr.next=prev;
        return reverse(next, curr);
            
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
        head=reverse(head,null);
        display(head);
    }
}
