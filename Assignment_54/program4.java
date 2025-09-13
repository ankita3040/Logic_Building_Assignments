// Write java program which accept marks of N students from user and display class of each student. 
/*
    Less than 35 -  Fail
    Less than 50 -  Pass class
    Less than 60 -  Second class
    Less than 70 -  First class 
    Greater than 70 -  First class with Distinction 
      
    Input :  63.7 45 77 90
    Output : 63.7  First class
             45    pass classs
             77    First class with Distinction
             90    First class with Distinction
 */

////////////////////////////////////////////////////////////////////////////////
// File Name   :  program4.java
// Description :  Accept  marks of N students from user and display class of each student. 
// Autor       :  Ankita Anil Patil
// Date        :  13/09/2025
///////////////////////////////////////////////////////////////////////////////


import java.util.*;

class MyArray 
{ 
        public void  Percentage(double arr[]) 
        { 
            int i = 0;
            for( i = 0; i < arr.length; i++)
            {
                if(arr[i] < 0)
                {
                    return;
                }
                if(arr[i] > 0  && arr[i] <= 35 )
                {
                    System.out.println(arr[i] + "\tFail");
                }
                else if(arr[i] > 35  && arr[i] <= 50 )
                {
                    System.out.println(arr[i] + "\tPass");
                }

                else if(arr[i] > 50  && arr[i] <= 60 )
                {
                    System.out.println(arr[i] + "\tFirst Class");
                }
                
                else if(arr[i] > 60  && arr[i] <= 70 )
                {
                    System.out.println(arr[i] + "\tSecond Class");
                }

                else if( arr[i] <= 100 )
                {
                    System.out.println(arr[i] + "\tFirst Class with distinction");
                }
            }
            
        }
} 
public class program4
    
{   
    public static void main(String[] args) {
        

    Scanner sobj = new Scanner(System.in);

    System.out.println("Enter size of array");
    int iSize = sobj.nextInt();


    double[] Arr = new double[iSize];
    System.out.println("Enter marks  : ");

    int i = 0;
    
    for(i = 0; i < Arr.length; i++)
    { 
       Arr[i] = sobj.nextDouble();
    }

    MyArray mobj = new MyArray();
    mobj.Percentage(Arr);

}
}
