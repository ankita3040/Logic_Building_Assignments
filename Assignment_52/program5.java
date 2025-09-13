// Write Java program which accept two arrays from user and display summation of each array. 
/*
 Input :  2 9 7 5 2 3 
          9 3 5 5 
Output : 28 22 
           
 */

 ///////////////////////////////////////////////////////////////////////////////
// File Name   :  program5.java
// Description :  Accept two arrays from user andand display summation of each array                         
// Autor       :  Ankita Anil Patil
// Date        :  13/09/2025
///////////////////////////////////////////////////////////////////////////////


import java.util.*;
class MyArray 
{ 
        public void SumArray(int Arr1[], int Arr2[]) 
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

             System.out.println("Summation of array 1 is : "+iSum1);
             System.out.println("Summation of array 2 is : "+iSum2);

    } 
} 

public class program5
    
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
    mobj.SumArray(Arr1, Arr2);
    
}
}

