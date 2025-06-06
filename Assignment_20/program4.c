// Accept N numbers from user and accept Range, Display all elements from that range


///////////////////////////////////////////////////////////////////////////////
// File Name   :  program4.c
// Description :  Accept N numbers from user and accept Range, Display all elements from that range
// Autor       :  Ankita Anil Patil
// Date        :  31/05/2025
///////////////////////////////////////////////////////////////////////////////


/*
 Input : N     : 6
         start : 60
         end   : 90
         Elements : 85 66 3 66 93 88
 Output: 66 85 88

  Input : N : 6
         start : 30
         end   : 50
         Elements : 35 66 3 66 43 88
 Output: 35  43
 */

 #include<stdio.h>
 #include<stdlib.h>

 void Range(int Arr[], int iSize, int iStart, int iEnd)
 {
    if((Arr  == NULL) || (iSize <= 0))
    {
        printf("Inavlid input");
        return ;
    }

    int i = 0;
     
    printf("Number between %d and %d \n",iStart,iEnd);

    for(i = 0; i < iSize; i++)
    {
        if((iStart < Arr[i] && iEnd > Arr[i]))
        {
            printf("%d\n",Arr[i]);
        }
    }

 }

 int main()
 {
    int iLength = 0, iCnt = 0, iValue1 = 0, iValue2 = 0;
    int *ptr = NULL;

    printf("Enter number of elements \n");
    scanf("%d",&iLength);

    ptr = (int *) malloc(iLength * sizeof(int));

    if(NULL == ptr)
    {
        printf("Unable to allocate memory ");
        return -1;
    }

    printf("Enter elements \n");
    
    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        scanf("%d",&ptr[iCnt]);
    }

    printf("Enter starting range :\n");
    scanf("%d",&iValue1);

    printf("Enter ending range :\n");
    scanf("%d",&iValue2);

    Range(ptr,iLength,iValue1,iValue2);

    free(ptr);
    return 0;
 }