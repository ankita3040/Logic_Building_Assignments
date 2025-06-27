// Write a program which display smallest digits of all element from singly linear linked list.
/*

Input linked list : |11|->|250|->|532|->|415|
Output : 1 0 2 1

*/

///////////////////////////////////////////////////////////////////////////////
// File Name   :  program4.c
// Description :  Display smallest digits of all element from singly linear linked list.
// Autor       :  Ankita Anil Patil
// Date        :  28/05/2025
///////////////////////////////////////////////////////////////////////////////




#include<stdio.h>
#include<stdlib.h>

struct node 
{
    int data;
    struct node *next;
};

typedef struct node NODE;
typedef struct node *PNODE;
typedef struct node **PPNODE;

void InsertFirst(PPNODE first, int no)
{
    PNODE newn = NULL;

    newn = (PNODE) malloc(sizeof(NODE));
    newn->data = no;
    newn->next = NULL;

    if(*first == NULL)
    {
        *first = newn;
    }
    else
    {
        newn->next = *first;
        *first = newn;
    }
}

void DisplaySmall( PNODE first)
{
    int small = 0, iDigit = 0;
    while(first != NULL)
    {
        small = 9;
        iDigit = 0;
        while((first)->data != 0)
        {
            iDigit = (first)->data  % 10;
            if(iDigit < small)
            {
                small = iDigit;
            }
            first->data = (first)->data / 10;
        }

        printf(" %d ",small );

        first = first->next;

    }

    printf("\n");
}


int main()
{
    PNODE head = NULL;

    InsertFirst(&head,415);
    InsertFirst(&head,532);
    InsertFirst(&head,250);
    InsertFirst(&head,11);

    DisplaySmall(head);

    return 0; 
}