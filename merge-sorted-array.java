1. 🧩 Problem Name:
Merge Sorted Array

========================================
2. 📄 Problem Description:
You are given two sorted arrays nums1 and nums2.
nums1 has size m + n, where first m elements are valid and last n are 0.
Merge nums2 into nums1 such that the final array is sorted.

========================================
3. 🔗 Problem Link:
https://leetcode.com/problems/merge-sorted-array/

========================================
4. 💡 Approach:
(Brute Force - Your Approach)
- Step 1: Copy all elements of nums2 into nums1 starting from index m
- Step 2: Sort the entire nums1 array
- Step 3: Final array becomes sorted

(Key Learning 🔥)
nums1[i + m] = nums2[i] → copy nums2 into empty space of nums1

========================================
5. 💻 Code:


class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = m+n;//6=3+3
         k =  nums1.length;//6
         n= nums2.length;//3
        for(int i = 0;i<nums2.length; i++){
           nums1[i+m] =  nums2[i]  ;
        }
        Arrays.sort(nums1);

    }
    public static void main (String args[]){
        int[] nums1= {1,2,3,0,0,0};
        int m = 3;
        int[] nums2= {2,5,6};
        int n=3;

        Solution sol = new Solution();
          
        sol.merge(nums1,m,nums2,n);
        System.out.println("RESULT ARRAAY :-" + nums1);
    }
}
========================================
6. ⏱ Time Complexity:
O((m+n) log(m+n)) → due to sorting

========================================
7. 📦 Space Complexity:
O(1) → in-place (ignoring sorting space)

========================================
8. 🔄 Other Approaches:

1. Optimal Two Pointer (Best 🚀)
   - Time: O(m + n)
   - Space: O(1)
   - Idea:
     - Start from the end of both arrays
     - Compare and place larger element at the end of nums1
     - Avoid sorting

   Example Logic:
   i = m-1, j = n-1, k = m+n-1

   while (j >= 0) {
       if (i >= 0 && nums1[i] > nums2[j]) {
           nums1[k--] = nums1[i--];
       } else {
           nums1[k--] = nums2[j--];
       }
   }

2. Extra Array
   - Time: O(m + n)
   - Space: O(m + n)
   - Idea: Use a third array and merge like merge sort

