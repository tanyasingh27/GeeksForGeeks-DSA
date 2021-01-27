//********************* Question *****************************

/*
Given an array arr[] of size N containing positive integers and an integer X, find the element in the array which is smaller than X and closest to it.



Example 1:

Input:
N = 5
arr[] = {4 67 13 12 15}
X = 16
Output: 15
Explanation: For a given value 16, there
are four values which are smaller than
it. But 15 is the number which is smaller
and closest to it with minimum difference
of 1.


Example 2:

Input:
N = 5
arr[] = {1 2 3 4 5}
X = 1
Output: -1
Explanation: No value is smaller than 1.


Your Task:
You don't need to read input or print anything. You need to complete the given function immediateSmaller() which takes arr, N and X as input parameters and returns the closest element that is smaller than X. If no such element exists, return -1.



Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)



Constraints:
1 <= N <= 103
1 <= arr[i], X <= 104
 */

//********************* Solution *****************************
package com.tanya;

public class FindImmediateSmallerThanX {
    public static int immediateSmaller(int arr[], int n, int x)
    {
        int diff = Integer.MAX_VALUE ;
        int el = -1;
        int currentDiff ;
        for(int a=0; a<n; a++){
            currentDiff = x-arr[a];
            if(diff > currentDiff && arr[a] < x){
                diff= currentDiff;
                el =arr[a];
            }
        }
        return el;
    }
}