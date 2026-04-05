1. 🧩 Problem Name:
Best Time to Buy and Sell Stock

========================================
2. 📄 Problem Description:
Given an array prices where prices[i] is the price of a stock on day i,
find the maximum profit you can achieve by buying on one day and selling on another day in the future.
If no profit is possible, return 0.

========================================
3. 🔗 Problem Link:
https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

========================================
4. 💡 Approach:
- Step 1: Initialize minimum price (buy) with first element
- Step 2: Traverse the array
- Step 3: Update minimum price whenever a smaller value is found
- Step 4: Calculate profit for each day (current price - minimum price)
- Step 5: Track maximum profit

🔥 Learnings / Mistakes:
- Initially used Integer.MAX_VALUE with index → WRONG (mixing value & index)
- Learned that:
  • Integer.MAX_VALUE should be used only for values, not indices
  • Index and value must never be mixed in comparisons
- Mistake: Tried finding global minimum first → failed for cases like {2,4,1}
- Insight: Best buy is NOT always global minimum
- Fix: Calculate profit while iterating (single pass)
- Also learned about variable scope issue (declaring inside if block)

========================================
5. 💻 Code:


class Solution {
    public int maxProfit(int[] prices) {

        int n= prices.length;
        int p = prices[0];//buy day
        int maxprofit=0;
       

        for(int i=0;i<n;i++){
            if (prices[i]< p){
                p=prices[i];
            }
        
        int profit = prices[i]-p;
        if(profit>maxprofit){
            maxprofit=profit;
        }
    }
        return maxprofit;
        
    }
    public static void main (String args[]){
        int[] prices = {7,1,5,3,6,4};
        Solution sol = new Solution();
        int result =sol.maxProfit(prices);
        System.out.println(result);
    }
}

========================================
6. ⏱ Time Complexity:
O(n)

========================================
7. 📦 Space Complexity:
O(1)

========================================
8. 🔄 Other Approaches:

1. Brute Force
   - Time: O(n^2)
   - Space: O(1)

2. Two Pointer (Variation of same logic)
   - Time: O(n)
   - Space: O(1)

