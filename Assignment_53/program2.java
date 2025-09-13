// Write a java program which accept two two arrays from user and display minimum element of each array. 
/*
    Input :  2 9 7 5 2 3 
             9 3 5 5 
    Output : 2 3
*/ 

 ///////////////////////////////////////////////////////////////////////////////
// File Name   :  program2.java
// Description :  Accept two arrays from user and display minimum element of each array.          
// Autor       :  Ankita Anil Patil
// Date        :  13/09/2025
///////////////////////////////////////////////////////////////////////////////

import java.util.*;

class MyArray 
{ 
        public void MinArray(int Arr1[], int Arr2[]) 
        {   
            int i = 0;
            int iMin1 = 0, iMin2 = 0;

            iMin1 = Arr1[0];
            for(i = 0; i < Arr1.length; i++)
            {
                if(Arr1[i] < iMin1)
                {
                    iMin1 = Arr1[i];
                }
            }

           
             iMin2 = Arr2[0];
            for(i = 0; i < Arr2.length; i++)
            {
                if(Arr2[i] < iMin2)
                {
                    iMin2 = Arr2[i];
                }
            }

            System.out.println("Minimum element from array 1 is : "+ iMin1);
            System.out.println("Minimum element from array 2 is : "+ iMin2);

        } 
} 
public class program2 
    
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
    mobj.MinArray(Arr1, Arr2);

    
    
}
}
