// Write Java program which accept array from user and display below pattern. 
/*
    Input :     8  6 4 2 4     
    Output :    * * * * * * * * 
                * * * * * * 
                * * * * 
                * * 
                * * * * 
 */

////////////////////////////////////////////////////////////////////////////////
// File Name   :  program5.java
// Description :  Accept array from user and display below pattern       
// Autor       :  Ankita Anil Patil
// Date        :  13/09/2025
///////////////////////////////////////////////////////////////////////////////


import java.util.*;

class MyArray 
{ 
    public void Pattern(int arr[])
    {
        int i = 0, j = 0;
        for(i = 0; i < arr.length;i++)
        {
            for(j = 0; j < arr[i]; j++)
            {
                System.out.print("*\t");
            }
            System.out.println();
        }

    }
        
} 
public class program5
    
{   
    public static void main(String[] args) {
        

    Scanner sobj = new Scanner(System.in);

    System.out.println("Enter size of array");
    int iSize = sobj.nextInt();


    int[] Arr = new int[iSize];
    System.out.println("Enter number one by one that you want to print * on each row  : ");

    int i = 0;
    
    for(i = 0; i < Arr.length; i++)
    { 
       Arr[i] = sobj.nextInt();
    }

    MyArray mobj = new MyArray();
    mobj.Pattern(Arr);

 
}
}
