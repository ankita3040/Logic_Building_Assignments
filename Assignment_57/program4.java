// Equilibrium index of an array 

// Equilibrium index of an array is an index such that the sum of 
// elements at lower indexes is equal to the sum of elements at 
// higher indexes. For example, in an arrya A:
/*
    Input :  A[-7,1,5,2,-4,3,0]
             A[0] = -7, A[1] = 1, A[2] = 5, A[3] = 2, A[4] = -4, A[5] = 3, A[6]=0 

    Output : 3 is an equilibrium index, because: 
            A[0] + A[1] + A[2] = A[4] + A[5] + A[6]

            6 is also an equilibrium index, because sum of zero elements is zero, i.e., 
            A[0] + A[1] + A[2] + A[3] + A[4] + A[5]=0 

            7 is not an equilibrium index, because it is not a valid index of array A. 
 */

////////////////////////////////////////////////////////////////////////////////
// File Name   :  program4.java
// Description :  Equilibrium index of an array is an index such that the sum of 
//                elements at lower indexes is equal to the sum of elements at higher indexes 
// Autor       :  Ankita Anil Patil
// Date        :  14/09/2025
///////////////////////////////////////////////////////////////////////////////

 class EquilibriumIndex 
 {
        // A[-7,1,5,2,-4,3,0]
        public int  equilibrium(int arr[], int n)
        {
            int i = 0, leftSum = 0, rightSum = 0, TotalSum = 0, index = 0;

            for(i = 0; i < arr.length; i++)
            {
                TotalSum = TotalSum + arr[i];
            }

            leftSum = 0;
            for(i = 0; i < arr.length; i++)
            {
                rightSum =TotalSum - leftSum  - arr[i];
                if(leftSum == rightSum)
                {
                    index = i;
                    break;
                }
                leftSum =leftSum + arr[i];
            }
            
            return index;
        }
}

class program4 {
    public static void main(String[] args) 
    {
        EquilibriumIndex equi = new EquilibriumIndex(); 

        int arr[] = {-7, 1, 5, 2, -4, 3, 0}; 
        int arr_size = arr.length; 

        System.out.println("First equilibrium index is " + equi.equilibrium(arr, arr_size));
    }
}
