//  Write java program which accept array from user and reverse each number of that array. 
/*
    Input :  89 687 56 549 87 9 
    Output : 98 786 65 945 78 9 
 */

////////////////////////////////////////////////////////////////////////////////
// File Name   :  program1.java
// Description :  A ccept array from user and reverse each number of that array.          
// Autor       :  Ankita Anil Patil
// Date        :  13/09/2025
///////////////////////////////////////////////////////////////////////////////


import java.util.*;

class MyArray 
{ 
        public void ReverseArray(int Arr[]) 
        {   
            
            int i = 0, iRev = 0,iDigit = 0;
           
            for(i = 0; i < Arr.length; i++)
            {   
                
                while(Arr[i] != 0)
                {
                    iDigit = Arr[i] % 10;
                    iRev = iRev * 10 + iDigit;
                    Arr[i] = Arr[i] / 10;
                }

                Arr[i] = iRev;
                iRev = 0;
                
            }

            System.out.println("After reverse elements in array are : ");
            for(i = 0; i < Arr.length; i++ )
            {
                System.out.print(Arr[i] + " ");
            }
        } 
} 
public class program1
    
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
    mobj.ReverseArray(Arr);

   
    
}
}
