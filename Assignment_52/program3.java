// Write Java program which accept two arrays from user and display odd contents of each array. 

/*
    Input : 2 9 6 5 2 3
            45 6 12 18 23 4 
    Output: 9 5 3 
            45 23
           
 */

 ///////////////////////////////////////////////////////////////////////////////
// File Name   :  program3.java
// Description :  Accept two arrays from user and display odd contents of each array.                              
// Autor       :  Ankita Anil Patil
// Date        :  13/09/2025
///////////////////////////////////////////////////////////////////////////////


import java.util.*;
class MyArray 
{ 
        public void DisplayOdd(int Arr1[], int Arr2[]) 
        { 
                int i = 0;
                System.out.println("Elements of array 1");

                for(i = 0; i < Arr1.length; i++)
                {
                        if((Arr1[i] % 2) != 0)
                        {
                                System.out.print(Arr1[i] + " ");
                        }
                
                }

                System.out.println("\nElements of array 2");

                for(i = 0; i < Arr2.length; i++)
                {
                        if((Arr2[i] % 2) != 0)
                        {
                                System.out.print(Arr2[i] + " ");
                        }
                }

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
    mobj.DisplayOdd(Arr1, Arr2);
    
}
}

