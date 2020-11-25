//********************* Question *****************************

/*

 */

//********************* Solution *****************************
package com.tanya;

public class SubarrayWithGivenSum {
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {

        ArrayList<Integer> res = new ArrayList<Integer>();
        int sum = 0, start=0;
        for(int i=0; i<n; i++){
            sum+= arr[i];

            while(sum > s && start < i){
                sum-= arr[start];
                start++;
            }

            if(sum == s){
                res.add(start+1);
                res.add(i+1);
                return res;
            }
        }
        res.add(-1);
        return res;
    }
}