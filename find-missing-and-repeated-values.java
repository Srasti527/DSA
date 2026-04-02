1. 🧩 Problem Name:
Find Missing and Repeated Values

========================================
2. 📄 Problem Description:
You are given an n x n grid containing numbers from 1 to n^2.
One number is repeated twice and one number is missing.
Return an array where:
- First element = repeated number
- Second element = missing number

========================================
3. 🔗 Problem Link:
https://leetcode.com/problems/find-missing-and-repeated-values/

========================================
4. 💡 Approach:
- Step 1: Create a frequency array of size n*n + 1
- Step 2: Traverse the grid and count occurrences of each number
- Step 3: Traverse frequency array:
    - If freq[i] == 2 → repeated number
    - If freq[i] == 0 → missing number
- Step 4: Return result as [repeated, missing]

========================================
5. 💻 Code:


class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int N = n * n;

        int[] freq = new int[N + 1];
        int repeated = -1;
        int missing = -1;

        // Count frequency
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                freq[grid[i][j]]++;
            }
        }

        // Find repeated and missing
        for (int i = 1; i <= N; i++) {
            if (freq[i] == 2) {
                repeated = i;
            } else if (freq[i] == 0) {
                missing = i;
            }
        }

        return new int[]{repeated, missing};
    }

    public static void main(String[] args) {
        int[][] grid = {{9,1,7},{8,9,2},{3,4,6}};
        Solution sol = new Solution();
        int[] result = sol.findMissingAndRepeatedValues(grid);
        System.out.println("repeated: " + result[0] + " missing: " + result[1]);
    }
}


========================================
6. ⏱ Time Complexity:
O(n^2)  → Traversing grid + frequency array

========================================
7. 📦 Space Complexity:
O(n^2)  → Frequency array

========================================
8. 🔄 Other Approaches:

1. Math (Sum & Square Sum Method)
   - Time: O(n^2)
   - Space: O(1)
   - Idea: Use formulas of sum and sum of squares to derive missing & repeated

2. HashSet Approach
   - Time: O(n^2)
   - Space: O(n^2)
   - Idea: Detect duplicate while inserting, then find missing

