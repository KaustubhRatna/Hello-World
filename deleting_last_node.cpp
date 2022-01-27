#include <bits/stdc++.h>
#include <stdio.h>
using namespace std;

struct Node
{
    int data;
    Node * next;
    Node(int x)
    {
        data=x;
        next=NULL;
    }
};

Node * deleting_last_node(Node * head)
{
    if(head==NULL)
    return head;
    if(head->next==NULL)
    {
        delete head;
        return NULL;
    }
    Node* temp=head;
    while(temp->next->next!=NULL)
    temp=temp->next;
    delete temp->next;
    temp->next=NULL;
    
    return head;
}
Node * insert_at_end(Node * head,int data)
{
   
    Node *temp=new Node(data);
    if(head==NULL)
    {
        return temp;
    }
    Node *t = head;
    while(t->next!=NULL)
    {
        t=t->next;
    }
    t->next=temp;
    temp->next=NULL;
    return head;
}
void display(Node * head)
{
    printf("\n");
    while(head!=NULL)
    {
        printf("%d   ",head->data);
        head=head->next;
    }
}
int main()
{
    Node *head=NULL;
    head=deleting_last_node(head);
    display(head);
    head=insert_at_end(head,1);
    display(head);
    head=deleting_last_node(head);
    display(head);
    head=insert_at_end(head,2);
    head=insert_at_end(head,3);
    head=insert_at_end(head,4);
    display(head);
    head=deleting_last_node(head);
    display(head);
    return 0;
}