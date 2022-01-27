#include <stdio.h>
#include <bits/stdc++.h>
using namespace std;

struct Node
{
    int data;
    Node *next;
    Node(int x)
    {
        data=x;
        next=NULL;
    }
};
int search(Node *head,int data)
{
    if(head==NULL)
    return -1;
    if(head->data==data)
    return 1;
    else
    {
        int res=search(head->next,data);
        if(res==-1)
        return -1;
        else
        return res+1;
    }
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
    printf("%d\n",search(head,5));
    head=insert_at_end(head,0);
    head=insert_at_end(head,1);
    head=insert_at_end(head,2);
    head=insert_at_end(head,3);
    head=insert_at_end(head,4);
    display(head);
    printf("\n%d\n",search(head,5));
    printf("\n%d\n",search(head,3));
    return 0;
}