//  Write java program which accept array from user and replace each member with summation of its digit. 
/*
    Input :  89 687 56 549 87 9 
    Output : 17 21  11 18 15 9 
 */

////////////////////////////////////////////////////////////////////////////////
// File Name   :  program2.java
// Description :  A ccept array from user and replace each member with summation of its digit.       
// Autor       :  Ankita Anil Patil
// Date        :  13/09/2025
///////////////////////////////////////////////////////////////////////////////


import java.util.*;

class MyArray 
{ 
        public void SumArray(int Arr[]) 
        {   
            
            int i = 0, iSum = 0,iDigit = 0;
           
            for(i = 0; i < Arr.length; i++)
            {   
                
                while(Arr[i] != 0)
                {
                    iDigit = Arr[i] % 10;
                    iSum = iSum  + iDigit;
                    Arr[i] = Arr[i] / 10;
                }

                Arr[i] = iSum;
                iSum = 0;
                
            }

            System.out.println("After summation elements in array are : ");
            for(i = 0; i < Arr.length; i++ )
            {
                System.out.print(Arr[i] + " ");
            }
        } 
} 
public class program2
    
{   
    public static void main(String[] args) {
        

    Scanner sobj = new Scanner(System.in);

    System.out.println("Enter size of array");
    int iSize = sobj.nextInt();


    int[] Arr = new int[iSize];
    System.out.println("Enter array elements : ");

    int i = 0;
    
    for(i = 0; i < Arr.length; i++)
    { 
       Arr[i] = sobj.nextInt();
    }

    MyArray mobj = new MyArray();
    mobj.SumArray(Arr);

   
    
}
}
