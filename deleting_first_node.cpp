#include <bits/stdc++.h>
#include <stdio.h>
using namespace std;

struct Node
{
    int data;
    Node*next;
    Node(int x)
    {
        data=x;
        next=NULL;
    }
};
Node* delete_at_begin(Node* head)
{
    if(head==NULL)
    return head;
    Node * t=head;
    head=head->next;
    free(t);
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
    head=delete_at_begin(head);
    display(head);
    head=insert_at_end(head,1);
    head=insert_at_end(head,2);
    display(head);
    head=delete_at_begin(head);
    display(head);
    return 0;
}