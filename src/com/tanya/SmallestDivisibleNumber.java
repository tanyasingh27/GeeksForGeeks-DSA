//********************* Question *****************************

/*
Smallest divisible number
Basic Accuracy: 49.87% Submissions: 19824 Points: 1
Given a number N, find an integer denoting the smallest number evenly divisible by each number from 1 to n.


Example 1:

Input:
N = 3
Output: 6
Explanation: 6 is the smallest number
divisible by 1,2,3.

Example 2:

Input:
N = 6
Output: 60
Explanation: 60 is the smallest number
divisible by 1,2,3,4,5,6.

Your Task:
You dont need to read input or print anything. Complete the function getSmallestDivNum() which takes N as input parameter and returns the smallest number evenly divisible by each number from 1 to n.


Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)


Constraints:
1 ≤ N ≤ 25
*/

//********************* Solution *****************************
package com.tanya;

class Solution {
    public static long getSmallestDivNum(int n){
        long ans = 1;
        for(long i=2; i<=n; i++){
            ans = (ans*i)/gcd(ans,i);
        }
        return ans;
    }

    public static long gcd(long a, long b){
        if(a == 0){
            return b;
        }
        return gcd(b%a, a);
    }
}
