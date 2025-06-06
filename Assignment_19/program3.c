// Accept N numbers from user check whether that numbers contains 11 in it or not.

///////////////////////////////////////////////////////////////////////////////
// File Name   :  program3.c
// Description :  Accept N numbers from user check whether that numbers contains 11 in it or not.
// Autor       :  Ankita Anil Patil
// Date        :  31/05/2025
///////////////////////////////////////////////////////////////////////////////

/*
 Input : N : 6
         Elements : 85 66 11 80 93 88 
 Output: 11 is present
 */

 #include<stdio.h>
 #include<stdlib.h>


 #define TRUE 1
 #define FALSE 0

 typedef int bool;

 bool Check(int Arr[], int iSize)
 {
    if((Arr == NULL) || (iSize <= 0 ))
    {
        printf("Invalid input ");
        return FALSE;
    }

    int i = 0;
    bool bFlag = FALSE;

    for(i = 0; i < iSize; i++)
    {
        if(Arr[i] == 11)
        {
           
           bFlag = TRUE;
           break;

        }
    }
    if(bFlag == TRUE)
    {
        return TRUE;
    }
    else
    {
        return FALSE;
    }
    

 }

 int main()
 {
    int iLength = 0, iCnt = 0;
    bool bRet = FALSE;
    int *ptr =NULL;

    printf("Enter number of elemets\n");
    scanf("%d",&iLength);

    ptr = (int *) malloc(iLength * sizeof(int));

    if(NULL == ptr)
    {
        printf("Unable to allocate memory ");
        return -1;
    }

    printf("Enter elements :\n");

    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        scanf("%d",&ptr[iCnt]);
    }

    bRet = Check(ptr,iLength);

    if(bRet == FALSE)
    {
        printf("11 is not present");
    }
    else
    {
        printf("11 is present");
    }


    free(ptr);

    ptr ==NULL;

    return 0;
 }