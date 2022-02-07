class Node{
    int data;
    Node next;
    Node(int x)
    {
        data=x;
        next=null;
    }
}
public class sorted_insert
{
    public static Node insert_sorted(Node head,int x)
    {
        Node temp=new Node(x);
        if(head==null)
        {
            return temp;
        }
        Node curr=head;
        Node prev=null;
        while(curr.next!=null)
        {
            if(curr.data>x)
            {
                if(prev==null)
                {
                    temp.next=curr;
                    return temp;
                }
                else
                {
                    prev.next=temp;
                    temp.next=curr;
                    return head;
                }
            }
            prev=curr;
            curr=curr.next;
        }
        curr.next=temp;
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
        head=insert_sorted(head, 20);
        head=insert_sorted(head, 5);
        head=insert_sorted(head, 25);
        display(head);
        head=insert_sorted(head, 15);
        display(head);
        head=insert_sorted(head, 0);
        display(head);
    }
    
}
