// ======================================
// LeetCode Problem: create target array in the given order
// Language: java
// Link: https://leetcode.com/problems/create-target-array-in-the-given-order/
// Synced by: LinkCode
// Date: 8/11/2026, 11:55:59 PM
// ======================================


class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        int mainindex = 0;
        for(int i=0;i<nums.length;i++){
            mainindex = index[i];
            for(int j=i;j>mainindex;j--){
                target[j]=target[j-1];
            }
            target[mainindex]=nums[i];
        }
        return target;
    }
}