// Accept N numbers from user and display all such numbers which contains 3 digits in it.

///////////////////////////////////////////////////////////////////////////////
// File Name   :  program4.c
// Description :  Accept N numbers from user and display all such numbers which contains 3 digits in it.
// Autor       :  Ankita Anil Patil
// Date        :  31/05/2025
///////////////////////////////////////////////////////////////////////////////


/*
 Input : N : 6
         Elements : 8225 665 3 76 953 858
 Output: 665 953 858

 */
 #include<stdio.h>
 #include<stdlib.h>

 void Display(int Arr[], int iSize)
 {
    if((Arr == NULL) || (iSize <= 0))
    {
        printf("Invalid input");
        return -1;
    }

    int i = 0, iDigit = 0, iCount = 0, iNo = 0;
    printf("Numbers which are contain 3 digits are :\n");
    for(i = 0; i < iSize; i++)
    {
        iNo = Arr[i];
        iCount = 0;
        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iCount++;
            iNo = iNo /10;
            
        }
        if(iCount == 3)
        {
        printf("%d\n",Arr[i]);
        }
    }
    

 }


 int main()
 {
    int iLength = 0, iCnt = 0;
    int *ptr = NULL;

    printf("Enter number of elements \n");
    scanf("%d",&iLength);

    ptr = (int *) malloc(iLength * sizeof(int));

    if(NULL == ptr)
    {
        printf("Unable to allocate memory");
        return -1;
    }

    printf("Enter elements\n");

    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        scanf("%d",&ptr[iCnt]);
    }

    Display(ptr,iLength);

    free (ptr);

    return 0;
 }