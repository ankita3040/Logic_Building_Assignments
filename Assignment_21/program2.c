// Accept N numbers from user and return the smallest number.

///////////////////////////////////////////////////////////////////////////////
// File Name   :  program2.c
// Description :  Accept N numbers from user and return the smallest number
// Autor       :  Ankita Anil Patil
// Date        :  31/05/2025
///////////////////////////////////////////////////////////////////////////////


/*
 Input : N : 6
         Elements : 85 66 3 66 93 88
 Output: 3

 */

 #include<stdio.h>
 #include<stdlib.h>
 
  int Minimum(int Arr[], int iSize)
  {
     if((Arr == NULL ) || (iSize <= 0))
     {
         printf("Invalid input ");
         return -1;
     }
 
     int i = 0, iMini = 0;
 
     iMini = Arr[0];
     for(i = 0; i < iSize; i++)
     {
         if(Arr[i] < iMini)
         {
                iMini = Arr[i];
         }
     }
 
     return iMini;
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
 
     iRet = Minimum(ptr,iLength);
     printf("Minimum number is %d\n",iRet);
 
     return 0;
  }