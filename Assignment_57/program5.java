// Given an array of integers, write a function that returns true if 
// there is a triplet (a, b, c) that satisfies a2 + b2 = c2. 

/*
    Input: arr[] = {3, 1, 4, 6, 5} 
    Output: True 
    There is a Pythagorean triplet (3, 4, 5). 

    Input: arr[] = {10, 4, 6, 12, 5} 
    Output: False 
    There is no Pythagorean triplet.
 */

////////////////////////////////////////////////////////////////////////////////
// File Name   :  program5.java
// Description :  Given an array of integers, write a function that returns true if 
//                there is a triplet (a, b, c) that satisfies a2 + b2 = c2. 
// Autor       :  Ankita Anil Patil
// Date        :  14/09/2025
///////////////////////////////////////////////////////////////////////////////

import java.util.Arrays;

class PythagoreanTriplet 
 {
        // {3, 1, 4, 6, 5} 
        public static boolean isTriplet(int arr[], int n)
        {
            int i = 0,first = 0, last = n-1;
            Arrays.sort(arr);
            //{1, 3, 4, 5, 6}
            for(i = 0; i < n; i++)
            {
                arr[i] = arr[i] * arr[i];
            }
            
            first = arr[0];
            last = arr[n-1];

            for (i = n - 1; i >= 2; i--)
            {
                first = 0;
                last = i - 1;

                while (first < last)
                {
                    if (arr[first] + arr[last] == arr[i])
                    {
                        return true; 
                    }

                    if (arr[first] + arr[last] < arr[i])
                    {
                        first++;
                    }
                        
                    else
                    {
                        last--;
                    }
                        
                }
            }
            
        return false;
        }
}

class program5 {
    public static void main(String[] args) 
    {
        int ar[] = {3, 1, 4, 6, 5}; 

        int ar_size = ar.length; 

        if(PythagoreanTriplet.isTriplet(ar,ar_size) == true) 
        {
            System.out.println("Yes");
        } 
        else
        {
            System.out.println("No");  
        } 
                     
    }

}
