// Write a java program to find Maximum difference between two 
// elements such that larger element appears after the smaller number 

/*
    Input : [2, 3, 10, 6, 4, 8, 1]
    Output : 8 (10-2)

    Input :  [ 7, 9, 5, 6, 3, 2 ]
    Output: 2 (9-7)
 */

////////////////////////////////////////////////////////////////////////////////
// File Name   :  program1.java
// Description :  accept two strings from user and check whether first string is
//                the rotation of second string or not.    
// Autor       :  Ankita Anil Patil
// Date        :  13/09/2025
///////////////////////////////////////////////////////////////////////////////


class MaximumDiffrence 
{ 
    public int maxDiff(int arr[], int arr_size) 
    { 

        int i = 0,larger = 0, smaller = 0, index = 0;
        larger = arr[0];
        for(i = 0; i < arr_size; i++)
        {
            if(arr[i] > larger)
            {
                larger = arr[i];
                index = i;
                
            }
        }

        
        smaller = arr[0] ;
        for(i = 0; i < index ; i++)
        {
            if(arr[i] < smaller )
            {
                smaller = arr[i];
            }
        }

        return (larger - smaller);
    } 
}   

class program1
{
        public static void main(String[] args) 
        { 
            MaximumDiffrence maxdif = new MaximumDiffrence(); 
            // int arr[] = {1, 2, 90, 10, 110}; 
            // int arr[] = {2, 3, 10, 6, 4, 8, 1};
            int arr[] = { 7, 9, 5, 6, 3, 2};
            System.out.println("Maximum differnce is " +maxdif.maxDiff(arr, 5)); 
        } 
        
} 
                
        