1. 🧩 Problem Name:
Single Number

========================================
2. 📄 Problem Description:
Given a non-empty array of integers nums, every element appears twice except for one.
Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

========================================
3. 🔗 Problem Link:
https://leetcode.com/problems/single-number/

========================================
4. 💡 Approach:
- Traverse each element of the array
- For every element, count its occurrences using a nested loop
- If the count is 1, return that element
- If no such element is found, return -1

========================================
5. 💻 Code:


class Solution {
    public int singleNumber(int[] nums) {
    
         int n = nums.length;
         for(int i=0;i<n;i++){
             int count = 0;
             for(int j=0;j<n;j++){
                if (nums[i]==nums[j])
                count++;
            }
        
           if(count==1){
            return nums[i];
           }}
           return -1;
          }  
        
    public static void main (String args[]){
        int[] nums={2,2,7,7,6,3,6};
        Solution sol = new Solution();
        int result=sol.singleNumber(nums);
        System.out.println(result);
    }
}


========================================
6. ⏱ Time Complexity:
O(n^2)

========================================
7. 📦 Space Complexity:
O(1)

========================================
8. 🔄 Other Approaches:

1. XOR Approach (Optimal):
   - Use XOR operation on all elements
   - Duplicate elements cancel out, leaving the single number
   - Time: O(n), Space: O(1)

2. HashMap:
   - Store frequency of elements
   - Return element with frequency 1
   - Time: O(n), Space: O(n)

========================================
9. 📘 Learnings:

- If we start inner loop from j = i + 1, the element will not compare with itself
- This can lead to incorrect counting
- In some cases, count may become 0 for the unique element, giving wrong result
*/
