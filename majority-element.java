1. 🧩 Problem Name:
Majority Element

========================================
2. 📄 Problem Description:
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times.
You may assume that the majority element always exists in the array.

========================================
3. 🔗 Problem Link:
https://leetcode.com/problems/majority-element/

========================================
4. 💡 Approach:
- Sort the array
- Since the majority element appears more than n/2 times,
  it will always be at index n/2 after sorting
- Return nums[n/2]

========================================
5. 💻 Code:


import java.util.Arrays;

class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}


========================================
6. ⏱ Time Complexity:
O(n log n)

========================================
7. 📦 Space Complexity:
O(1)

========================================
8. 🔄 Other Approaches:

1. Boyer-Moore Voting Algorithm:
   - Most optimal approach
   - Time: O(n), Space: O(1)

2. HashMap:
   - Count frequency of each element
   - Return element with count > n/2
   - Time: O(n), Space: O(n)

