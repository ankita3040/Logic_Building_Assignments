//  Write a java program which print Fibonacci series 
/*
    Input : 5
    Output: 0 1 2 3 5 8
 
 */ 

////////////////////////////////////////////////////////////////////////////////
// File Name   :  program3.java
// Description :  Accept number from user print fibonacci series upto that number
// Autor       :  Ankita Anil Patil
// Date        :  14/09/2025
///////////////////////////////////////////////////////////////////////////////

import java.util.*; 

class Fibonacci
{
    public static void FibonacciSeries(int no)
        {
            int i = 0, first = 0, second = 1, sum = 0;

            System.out.print(first + " " + second + " ");
            for(i = 0; i < no ; i++)
            {
                sum =  first + second;

                first = second;
                second = sum;

                System.out.print(sum + " ");
            }

        
        }
}
class program3
{
    public static void main(String args[]) 
    { 
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        int no = sobj.nextInt();

        
        Fibonacci.FibonacciSeries(no);
      

    } 
    
}

