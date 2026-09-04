// ======================================
// LeetCode Problem: richest customer wealth
// Language: java
// Link: https://leetcode.com/problems/richest-customer-wealth/
// Synced by: LinkCode
// Date: 04/09/2026, 12:42:53
// ======================================


class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        int wealth = 0;
        for(int row = 0; row<accounts.length;row++){
            wealth = 0;
            for(int col=0;col<accounts[row].length;col++){
                wealth = wealth + accounts[row][col];
            }
            if(wealth > max){
                max = wealth;
            }
        }
        return max;
    }
}