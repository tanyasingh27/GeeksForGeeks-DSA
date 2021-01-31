//********************* Question *****************************

/*

 */

//********************* Solution *****************************
package com.tanya;

public class KadaneAlgorithm {
    // Function to find subarray with maximum sum
    // arr: input array
    // n: size of array
    int maxSubarraySum(int arr[], int n){
        int maxSum = 0 ;
        int currentSum = 0 ;
        for(int i=0; i<n; i++){
            currentSum += arr[i];
            if(currentSum > maxSum)
                maxSum = currentSum;
            if(currentSum < 0)
                currentSum = 0;
        }
        return maxSum;
    }
}