import java.util.HashMap;

// https://leetcode.com/problems/contiguous-array/

/*
Given a binary array nums, return the maximum length of a contiguous subarray with an equal number of 0 and 1.
Input: nums = [0,1,0]
Output: 2
Explanation: [0, 1] (or [1, 0]) is a longest contiguous subarray with equal number of 0 and 1.
*/

public class FindMaxLen01 {
    public int findMaxLength(int[] nums) {
        int max_len = 0;
        // the hash map keeps the frontmost index of a cumulative sum value
        // <Value, Index>
        HashMap <Integer, Integer> frontmost_cum_sum_idx = new HashMap<>();
        frontmost_cum_sum_idx.put(0, -1);
        //
        int cum_sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==1) cum_sum ++;
            else cum_sum --;

            if (frontmost_cum_sum_idx.containsKey(cum_sum)) {
                max_len = Math.max(max_len, i - frontmost_cum_sum_idx.get(cum_sum));
            }
            else frontmost_cum_sum_idx.put(cum_sum, i);
        }
        return max_len;
    }
}
