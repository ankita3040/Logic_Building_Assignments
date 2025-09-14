// Given an array arr[] of n integers, 
// construct a Product Array  prod[] (of same size) such that prod[i] is equal to 
// the product of all the elements of arr[] except arr[i]. Solve it without division operator and in O(n).  

/*
    Input :  arr[] = {10, 3, 5, 6, 2} 
    Output : prod[] = {180, 600, 360, 300, 900}

 */

////////////////////////////////////////////////////////////////////////////////
// File Name   :  program2.java
// Description :  accept array arr[] of n integers, 
//                construct a Product Array  prod[] (of same size) such that 
//                prod[i] is equal to the product of all the elements of arr[]

//                except arr[i]. Solve it without division operator and in O(n).   
// Autor       :  Ankita Anil Patil
// Date        :  14/09/2025
///////////////////////////////////////////////////////////////////////////////

 class ProductArray 
 {
        public void productArray(int arr[], int n)
        {

            int[] left = new int[n];
            int[] right = new int[n];
            int[] prod = new int[n];

            
            left[0] = 1;
            for (int i = 1; i < n; i++) 
            {
                left[i] = arr[i - 1] * left[i - 1];
            }

        
            right[n - 1] = 1;
            for (int j = n - 2; j >= 0; j--) 
            {
                right[j] = arr[j + 1] * right[j + 1];
            }

        
            for (int i = 0; i < n; i++) 
            {
                prod[i] = left[i] * right[i];
            }

            for (int i = 0; i < n; i++)
            {
                System.out.print(prod[i] + "\t");
            }
    }
}

class program2 {
    public static void main(String[] args) {
        ProductArray pa = new ProductArray();
        int arr[] = {10, 3, 5, 6, 2};
        int n = arr.length;

        System.out.println("The product array is : ");
        pa.productArray(arr, n);
    }
}
