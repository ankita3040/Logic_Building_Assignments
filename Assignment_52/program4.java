// Write Java program which accept two arrays from user and form new array
// which is combination of contents of first and second array
/*
    Input :  12 57 28 3 
             99 23 54 58 6 67 
    Output : 12 57 28 3 99 23 54 58 6 67 
           
 */

 ///////////////////////////////////////////////////////////////////////////////
// File Name   :  program4.java
// Description :  Accept two arrays from user and form new array
//                which is combination of contents of first and second array                           
// Autor       :  Ankita Anil Patil
// Date        :  13/09/2025
///////////////////////////////////////////////////////////////////////////////


import java.util.*;
class MyArray 
{ 
        public int[] ArrayConcate(int arr1[], int iSize1, int arr2[], int iSize2) 
        { 
                int i = 0;

                Scanner sobj = new Scanner(System.in);

                arr1 = new int[iSize1];
                arr2 = new int[iSize2];
                int Arrnew[] = new int[iSize1 + iSize2 ];

                System.out.println("Enter elements in array 1");

                for(i = 0; i < arr1.length; i++)
                {
                        arr1[i] = sobj.nextInt();
                }

                System.out.println("Enter elements in array 2");

                for(i = 0; i < arr2.length; i++)
                {
                        arr2[i] = sobj.nextInt();
                }

                int j = 0;
                for(i = 0;  i < arr1.length ; i++)
                {    
                     Arrnew[i] = arr1[i];  
                }

                
                for( j = 0; j < arr2.length ;j++)
                {    
                     Arrnew[i++] = arr2[j];  
                }


              return Arrnew;

        } 
} 

public class program4
    
{   
    public static void main(String[] args) {
        

    Scanner sobj = new Scanner(System.in);

    System.out.println("Enter size of array  1");
    int iSize1 = sobj.nextInt();

    System.out.println("Enter size of array  2");
    int iSize2 = sobj.nextInt();

    int[] Arr1 = null;
    int[] Arr2 = null;
   
    MyArray mobj = new MyArray();
    int newArr[] = mobj.ArrayConcate(Arr1,iSize1 ,Arr2,iSize2);

    System.out.println("Elements from new array are ");
        int i = 0;
        for( i = 0; i < newArr.length; i++)
        {
               System.out.print(newArr[i] + " ");
        }
    
}
}
