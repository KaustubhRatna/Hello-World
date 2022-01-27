#include <bits/stdc++.h>
#include <stdio.h>
using namespace std;

struct Node
{
    Node *next;
    int data;
    Node(int x)
    {
        data=x;
        next=NULL;
    }
};
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
    while(head!=NULL)
    {
        printf("%d   ",head->data);
        head=head->next;
    }
}
int main()
{
    Node *head=NULL;
    head=insert_at_end(head,1);
    head=insert_at_end(head,2);
    display(head);
    return 0;
}