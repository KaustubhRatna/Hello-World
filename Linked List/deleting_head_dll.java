class Node
{
    int data;
    Node next;
    Node prev;
    Node(int x)
    {
        data=x;
        next=null;
        prev=null;
    }
}
public class deleting_head_dll 
{
 
    public static Node insert_begin(Node head,int data)
    {
        Node temp=new Node(data);
        if(head==null)
        return temp;
        temp.next=head;
        head.prev=temp;
        return temp;
    }
    public static Node delete_head(Node head)
    {
        if(head==null||head.next==null)
        {
            head=null;
        return head;
        }
        head=head.next;
        head.prev=null;
        return head;
    }
    public static void display(Node head)
    {
        if(head==null)
        {
        System.out.println("Linked List empty");
            return;
        }
        System.out.println("linked list values are : ");
        while(head.next!=null)
        {
            System.out.print(head.data+"->");
            head=head.next;
        }
        System.out.println(head.data);
    }
    public static void main(String[] args) 
    {  
      
        Node head=new Node(3);
        head=insert_begin(head, 2);
        head=insert_begin(head, 1);
        display(head);
        head=delete_head(head);
        display(head);
        head=delete_head(head);
        display(head);
        head=delete_head(head);
        display(head);
        head=delete_head(head);
        display(head);
        
    } 
}
