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
public class reverse_lLL_iterative
 {
    public static Node reverse(Node head)
    {
        if(head==null)
        return head;
        Node curr=head.next;
        Node prev=head;
        while(curr!=null)
        {
            Node temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        head.next=null;
        return prev;
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
        Node head=new Node(1);
        display(reverse(head));
    	head.next=new Node(20);
    	head.next.next=new Node(30);
    	display(head);
    	head=reverse(head);
    	display(head);
    	
        System.out.println("reverse of linked list is:");
        display(reverse(head));       
    }
}
