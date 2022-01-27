#include <bits/stdc++.h>
#include <stdio.h>
using namespace std;

struct Node
{
    int data;
    Node* next;
    Node(int x)
    {
        data=x;
        next=NULL;
    }
};
Node* insert_at_any(Node* head,int data,int pos)
{
    Node *temp=new Node(data);
    if(pos==1)
    {
        temp->next=head;
        return temp;
    }
    Node *curr=head;
    for(int i=1;i<=pos-2&&curr!=NULL;i++)
    curr=curr->next;
    if(curr==NULL)
    return head;
    temp->next=curr->next;
    curr->next=temp;
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
    head=insert_at_end(head,0);
    display(head);
    head=insert_at_end(head,1);
    display(head);
    head=insert_at_end(head,2);
    head=insert_at_end(head,3);
    head=insert_at_end(head,4);
    display(head);
    head=insert_at_any(head,5,6);
    display(head);
    return 0;
}