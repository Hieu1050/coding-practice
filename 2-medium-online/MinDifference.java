
// https://leetcode.com/problems/minimum-difference-between-largest-and-smallest-value-in-three-moves/

// You are given an integer array nums. In one move, you can choose one element of nums and change it by any value.

// Return the minimum difference between the largest and smallest value of nums after performing at most three moves.

import java.util.Arrays;
public class MinDifference {
    public static void main(String[] args) {
        
    }
    public static int Solution (int[] nums){
        int n = nums.length, res = Integer.MAX_VALUE;
        if (n < 5) return 0;
        Arrays.sort(nums);
        for (int i = 0; i < 4; ++i) {
            res = Math.min(res, nums[n - 4 + i] - nums[i]);
        }
        return res;
    }
}










