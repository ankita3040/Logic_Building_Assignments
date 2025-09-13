// Write a java program which accept two array from user and copy 
// the contents of that array into another array and return new array.  
/*
    Input :  1 2 3 
             4 5 6  
    Output : 1 2 3 4 5 6
*/ 

 ///////////////////////////////////////////////////////////////////////////////
// File Name   :  program4.java
// Description :  Accept two arrays from user and copy the contents of 
//                that array into another array and return new array.         
// Autor       :  Ankita Anil Patil
// Date        :  13/09/2025
///////////////////////////////////////////////////////////////////////////////

import java.util.*;

class MyArray 
{ 
        public int[] CopyArr(int Arr1[], int Arr2[]) 
        {   
            int i = 0, j = 0;
            int newArr[] = new int[Arr1.length + Arr2.length];

            for(i = 0 ; i < Arr1.length; i++)
            {   
               newArr[i] = Arr1[i]; 
            }

            for(j = 0 ; j < Arr2.length; j++)
            {                
               newArr[i++] = Arr2[j]; 
            }

            return newArr;
        } 
} 
public class program4
    
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
    int newArray [] = mobj.CopyArr(Arr1, Arr2);

    for(i = 0; i < newArray.length; i++)
    {
        System.out.print(newArray[i] + " \t");
    }
    
    
}
}
