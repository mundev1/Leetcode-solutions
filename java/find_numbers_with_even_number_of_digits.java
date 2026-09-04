// ======================================
// LeetCode Problem: find numbers with even number of digits
// Language: java
// Link: https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
// Synced by: LinkCode
// Date: 04/09/2026, 12:33:50
// ======================================


class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        int nos = 0;
        for(int i=0;i<nums.length;i++){
            count = 0;
            while(nums[i]>0){
            count++;
            nums[i] = nums[i]/10;
            }
            if(count%2==0){
                nos++;
            }
        }
        return nos;
    }
}