// Accept N numbers from user and display summation of digits of each number.

///////////////////////////////////////////////////////////////////////////////
// File Name   :  program5.c
// Description :  Accept N numbers from user and return the smallest number
// Autor       :  Ankita Anil Patil
// Date        :  31/05/2025
///////////////////////////////////////////////////////////////////////////////


/*
 Input : N : 6
         Elements : 8225 665 3 76 953 858
 Output: 17 17 3 13 17 21

 */
 #include<stdio.h>
 #include<stdlib.h>

 void DigitSum(int Arr[], int iSize)
 {
    if((Arr == NULL) || (iSize <= 0))
    {
        printf("Invalid input");
        return -1;
    }

    int i = 0, iDigit = 0, iSum = 0, iNo = 0;
    
    for(i = 0; i < iSize; i++)
    {
        iNo = Arr[i];
        iSum = 0;
        
        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iSum = iSum + iDigit;
        
            iNo = iNo /10;
            
        }

        printf("Summation of %d  is : %d\n",Arr[i],iSum);
       
    }

 }


 int main()
 {
    int iLength = 0, iCnt = 0, iRet = 0;
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

    DigitSum(ptr,iLength);
  
    free(ptr);

    return 0;
 }