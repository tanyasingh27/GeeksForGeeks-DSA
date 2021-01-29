//********************* Question *****************************

/*Given an array arr[] of size N where every element is in the range from 0 to n-1. Rearrange the given array so that arr[i] becomes arr[arr[i]].

Example 1:

Input:
N = 2
arr[] = {1,0}
Output: 0 1
Explanation:
arr[arr[0]] = arr[1] = 0.
arr[arr[1]] = arr[0] = 1.


Example 2:

Input:
N = 5
arr[] = {4,0,2,1,3}
Output: 3 4 2 0 1
Explanation:
arr[arr[0]] = arr[4] = 3.
arr[arr[1]] = arr[0] = 4.
and so on.


Your Task:
You don't need to read input or print anything. The task is to complete the function arrange() which takes arr and N as input parameters and rearranges the elements in the array in-place.


Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)


Constraints:
1 <= N <= 107
0 <= Arr[i] < N
 */

//********************* Solution *****************************
package com.tanya;

public class RearrangeArrayWithoutExtraSpace{
    // Function to rearrange the elements
    // arr: input array
    // n: size of array
    static void arrange(long arr[], int n)
    {
        int newIdx;
        long newEl, FinalEl ;
        for(int i=0 ; i<n ; i++){
            newIdx = (int) arr[i];
            newEl = arr[newIdx] % n;
            FinalEl = arr[i] + newEl * n;
            arr[i] = FinalEl;
        }

        for(int i=0 ; i<n ; i++){
            arr[i] = arr[i]/n;
        }
    }
}