// Write a java program which accept two array from user and copy the contents of 
// that array into another array in reverse order and return new array. 
/*
    Input :  1 2 3
             4 5 6 
    Output : 3 2 1 6 5 4 
*/ 

 ///////////////////////////////////////////////////////////////////////////////
// File Name   :  program3.java
// Description :  Accept two arrays from user and copy the contents of 
//                that array into another array in reverse order and return new array.         
// Autor       :  Ankita Anil Patil
// Date        :  13/09/2025
///////////////////////////////////////////////////////////////////////////////

import java.util.*;

class MyArray 
{ 
        public int[] CopyArrRev(int Arr1[], int Arr2[]) 
        {   
            int i = 0, j = 0;
            int newArr[] = new int[Arr1.length + Arr2.length];

            for(i = Arr1.length-1,j = 0 ; i >= 0; i--, j++)
            {   
               newArr[j] = Arr1[i]; 
            }

            for(i = Arr2.length-1; i >= 0; i--)
            {                
               newArr[j++] = Arr2[i]; 
            }

            return newArr;
        } 
} 
public class program3 
    
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
    int newArray [] = mobj.CopyArrRev(Arr1, Arr2);

    for(i = 0; i < newArray.length; i++)
    {
        System.out.print(newArray[i] + " \t");
    }
    
    
}
}
