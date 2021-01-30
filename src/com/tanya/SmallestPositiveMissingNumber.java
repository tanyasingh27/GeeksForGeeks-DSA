//********************* Question *****************************

/*
Given an array arr[] of size N, find the smallest positive number missing from the array.



Example 1:

Input:
N = 5
arr[] = {1,2,3,4,5}
Output: 6
Explanation: Smallest positive missing
number is 6.


Example 2:

Input:
N = 5
arr[] = {0,-10,1,3,-20}
Output: 2


Your Task:
You don't need to read input or print anything. The task is to complete the function findMissing() which takes arr and N as input parameters and returns the smallest positive missing number.



Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)



Constraints:
1 <= N <= 106
-106 <= arr[i] <= 106
 */

//********************* Solution *****************************
package com.tanya;

public class SmallestPositiveMissingNumber {
    // Function to find
    static int findMissing(int arr[], int size)
    {
        boolean one = false;
        for(int i=0; i<size; i++){
            if(arr[i] == 1 ){
                one = true;
                break;
            }
        }

        if(!one) return 1;

        for(int i=0; i<size; i++){
            if(arr[i] <= 0 || arr[i] > size){
                arr[i] = 1;
            }
        }

        for(int j=0; j<size; j++){
            arr[(arr[j]- 1) % size] += size;
        }

        for(int i=0; i<size; i++){
            if(arr[i] < size){
                return i+1;
            }
        }

        return size+1;
    }
}