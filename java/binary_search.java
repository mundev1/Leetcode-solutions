// ======================================
// LeetCode Problem: binary search
// Language: java
// Link: https://leetcode.com/problems/binary-search/
// Synced by: LinkCode
// Date: 05/09/2026, 14:30:14
// ======================================


class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int mid = 0;
        while(start<=end){
            mid = start + (end - start ) /2;
            if(target>nums[mid]){
                start = mid + 1;
            }
            else if(target<nums[mid]){
                end = mid-1;
            }
            else{
                return mid;
            }
    }
    return -1;
}
}