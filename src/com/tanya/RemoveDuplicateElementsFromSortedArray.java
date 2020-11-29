//********************* Question *****************************

/*
Given a sorted array A of size N, delete all the duplicates elements from A.


Example 1:

Input:
N = 5
Array = {2, 2, 2, 2, 2}
Output: 2
Explanation: After removing all the duplicates
only one instance of 2 will remain.

Example 2:

Input:
N = 3
Array = {1, 2, 2}
Output: 1 2

Your Task:
You dont need to read input or print anything. Complete the function remove_duplicate() which takes the array A[] and its size N as input parameters and modifies it in place to delete all the duplicates. The function must return an integer X denoting the new modified size of the array.
Note: The generated output will print all the elements of the modified array from index 0 to X-1.


Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)


Constraints:
1 <= N <= 104
1 <= A[i] <= 106


 */

//********************* Solution *****************************
package com.tanya;

public class RemoveDuplicateElementsFromSortedArray {
    int remove_duplicate(int A[],int N){
        // code here
        int start = 0;
        int end = 1;
        while(end < N){
            if(A[start] == A[end]) end++;
            else{
                A[++start] = A[end++];
            }
        }
        return start+1; //new size of array
    }
}