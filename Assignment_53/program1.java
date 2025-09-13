// Write a java program which accept two arrays from user and return difference between summation of arrays.
/*
    Input :  2 9 7 5 2 3 
             9 3 5 5 
    Output : 6 
*/ 

 ///////////////////////////////////////////////////////////////////////////////
// File Name   :  program1.java
// Description :  Accept two arrays from user and return difference between summation of arrays.           
// Autor       :  Ankita Anil Patil
// Date        :  13/09/2025
///////////////////////////////////////////////////////////////////////////////

import java.util.*;

class MyArray 
{ 
        public int DiffArray(int Arr1[], int Arr2[]) 
        {   
            int i = 0;
            int iSum1 = 0, iSum2 = 0;

            for(i = 0; i < Arr1.length; i++)
            {
                iSum1 = iSum1 + Arr1[i];
            }

           

            for(i = 0; i < Arr2.length; i++)
            {
                iSum2 = iSum2 + Arr2[i];
            }

            return (iSum1 - iSum2);

        } 
} 
public class program1 
    
{   
    public static void main(String[] args) {
        

    Scanner sobj = new Scanner(System.in);


    System.out.println("Array 1: ");
    System.out.println("Enter size of array");
    int iSize = sobj.nextInt();


    int[] Arr1 = new int[iSize];
    System.out.println("Enter array 1 elements : ");

    int i = 0;
    for(i = 0; i < Arr1.length; i++)
    { 
       Arr1[i] = sobj.nextInt();
    }

    System.out.println("Array 2: ");
    System.out.println("Enter size of array");
    int iSize2 = sobj.nextInt();


    int[] Arr2 = new int[iSize2];
    System.out.println("Enter array  2 elements : ");

    for(i = 0; i < Arr2.length; i++)
    {
        Arr2[i] = sobj.nextInt();
    }
    
    MyArray mobj = new MyArray();
    int iRet =  mobj.DiffArray(Arr1, Arr2);

    System.out.println("Difference is : "+ iRet);
    
}
}
