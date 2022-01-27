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
    }
};
Node * insert_at_begin(Node*head,int data)
{
    Node * temp=new Node(data);
    temp->next=head;
    return temp;
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
    head=insert_at_begin(head,5);
    head=insert_at_begin(head,15);
    display(head);
    return 0;
}