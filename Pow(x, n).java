1. 🧩 Problem Name:
Pow(x, n)

========================================
2. 📄 Problem Description:
Implement pow(x, n), which calculates x raised to the power n (i.e., x^n).

========================================
3. 🔗 Problem Link:
https://leetcode.com/problems/powx-n/

========================================
4. 💡 Approach:
- Convert exponent n to long to avoid overflow
- Handle negative exponent by taking reciprocal of x and making exponent positive
- Use Binary Exponentiation:
  - If exponent is odd, multiply result with current base
  - Square the base
  - Halve the exponent
- Repeat until exponent becomes 0

========================================
5. 💻 Code:
*/

// class Solution {
//     public double myPow(double x, int n) {
//         if(n==0) return 1; // edge case 
     
//         long N =n;// to prevent overflow if int n = -2147483648;  // Integer.MIN_VALUE n = -n; //  overflow

//        if(N<0){
//         x=1/x;
//         N=-N;
//        }

//        double result= 1;

//         for(long i=0;i<N;i++){
//            result= result*x; // int result *= x;
//         }
//         return result;
//     }
// }

//Brute force approach gives Time Limit Exceeded (TLE) TC O(n)

class Solution {
    public double myPow(double x, int n) {
        
        long N = n;  // convert to long to avoid overflow
        
        // Handle negative exponent
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        
        double result = 1;
        
        // Binary exponentiation
        while (N > 0) {
            
            // If N is odd, multiply result with current x
            if (N % 2 == 1) {
                result *= x;
            }
            
            // Square the base
            x *= x;
            
            // Divide exponent by 2
            N /= 2;
        }
        
        return result;
    }
}

/*
========================================
6. ⏱ Time Complexity:
O(log n)

========================================
7. 📦 Space Complexity:
O(1)

========================================
8. 🔄 Other Approaches:

1. Brute Force (Commented Above):
   - Multiply x, n times
   - Time: O(n), Space: O(1)

========================================
========================================
9. 📘 Learnings:

- Using long prevents overflow for edge case n = Integer.MIN_VALUE
- Binary exponentiation reduces time complexity from O(n) to O(log n)
- Handling negative powers requires converting x to 1/x

- Brute force approach gives Time Limit Exceeded (TLE)
  because it runs a loop n times (O(n)), which is very slow
  for large values of n (up to 10^9)

- Binary exponentiation is efficient because it reduces
  the number of operations by half in each step

