// Segregate Even and Odd numbers 

// Given an array A[], write a function that segregates even and odd 
//numbers. The functions should put all even numbers first, and then odd numbers.

/*
    Input :  arr[] = {12, 34, 45, 9, 8, 90, 3}
    Output : prod[] = {12, 34, 8, 90, 45, 9, 3} 

 */

////////////////////////////////////////////////////////////////////////////////
// File Name   :  program3.java
// Description :  Given an array A[], write a function that segregates even and odd numbers
//                The functions should put all even numbers first, and then odd numbers.   
// Autor       :  Ankita Anil Patil
// Date        :  14/09/2025
///////////////////////////////////////////////////////////////////////////////

 class SegregateOddEven 
 {
        public static void segregateEvenOdd(int arr[])
        {
            int i = 0, iStart = 0, iEnd = 0, temp = 0;

            iStart = 0;
            iEnd = arr.length-1;

            while (iStart < iEnd)    
            {
                    if(arr[iStart] % 2 == 0)
                    {
                        iStart++;
                    }
                    else if(arr[iEnd] % 2 != 0)
                    {
                        iEnd--;
                    }
                    else
                    {
                        temp = arr[iStart];
                        arr[iStart] = arr[iEnd];
                        arr[iEnd] =temp;

                        iStart++;
                        iEnd--;

                    }
            }
           
        }
}

class program3 {
    public static void main(String[] args) 
    {
        
        int arr[] = {12, 34, 45, 9, 8, 90, 3}; 
        SegregateOddEven.segregateEvenOdd(arr); 

        System.out.print("Array after segregation "); 

        for (int i = 0; i < arr.length; i++) 
        System.out.print(arr[i]+" "); 
    }
}
