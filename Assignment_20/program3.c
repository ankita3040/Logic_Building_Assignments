// Accept N numbers from user and accept one another number as NO , return index of last occurrence of that NO

///////////////////////////////////////////////////////////////////////////////
// File Name   :  program3.c
// Description :  Accept N numbers from user and accept one another number as NO , return index of last occurrence of that NO
// Autor       :  Ankita Anil Patil
// Date        :  31/05/2025
///////////////////////////////////////////////////////////////////////////////


/*
 Input : N : 6
         No : 66
         Elements : 85 66 3 66 93 88
 Output: 3

  Input : N : 6
         No : 12
         Elements : 85 66 3 66 93 88
 Output: -1
 */

 #include<stdio.h>
 #include<stdlib.h>

 int FirstOcc(int Arr[], int iSize, int iNo)
 {
    if((Arr == NULL) || (iSize <= 0 ))
    {
        printf("Invalid input ");
        return -1;
    }
    int i = 0, index = -1;

    for(i = 0; i < iSize; i++)
    {
        if(Arr[i] == iNo)
        {
            index = i;
            
        }
    }

    return index;
 
    

 }

 int main()
 {
    int iLength = 0, iCnt = 0, iValue = 0, iRet = 0;
  
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

    printf("Enter number to check index of last occurrence of that Number\n");
    scanf("%d",&iValue);

    iRet = FirstOcc(ptr,iLength,iValue);

    if(iRet >= 0)
    {
        printf("Last occurrence of that number at  index %d\n",iRet);
    }
    else
    {
        printf("Element not found  returning %d\n",iRet);
    }

    free(ptr);


    return 0;
 }