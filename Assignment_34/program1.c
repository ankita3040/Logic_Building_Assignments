// Write a program which search first occurrence of particular element from singly linear linked list.
// Function should return position at which element is found.
/*

    Input linked list : |10|->|20|->|30|->|40|->|50|->|30|->|70|
    Input element : 30
    Output : 3

*/

///////////////////////////////////////////////////////////////////////////////
// File Name   :  program1.c
// Description :  Search first occurrence of particular element from singly linear linked list.
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

    newn = (PNODE) malloc (sizeof(NODE));
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

int SearchFirstOcc( PNODE first , int no )
{
    int iCount = 0;
    while(first != NULL)
    {
        iCount++;
        if(first->data == no)
        {
            break;
        }
        first = first->next;
    }

    return iCount;

}

void Display(PNODE first)
{
    while(first  != NULL)
    {
        printf (" %d ",first->data);
        first = first->next;
    }

    printf("\n");
}

int main()
{
    PNODE head = NULL;
    int iRet = 0;

    InsertFirst(&head,70);
    InsertFirst(&head,30);
    InsertFirst(&head,50);
    InsertFirst(&head,40);
    InsertFirst(&head,30);
    InsertFirst(&head,20);
    InsertFirst(&head,10);

    Display(head);

    iRet = SearchFirstOcc(head,30);

    printf("First occurence of 30 element in singly LL is %d\n",iRet);

    return 0;
}

