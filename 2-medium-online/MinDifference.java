
// https://leetcode.com/problems/minimum-difference-between-largest-and-smallest-value-in-three-moves/

// You are given an integer array nums. In one move, you can choose one element of nums and change it by any value.

// Return the minimum difference between the largest and smallest value of nums after performing at most three moves.

import java.util.Arrays;
public class MinDifference {
    public static void main(String[] args) {
        
    }
    public int minDifference(int[] nums) {
        if (nums.length <= 4) return 0;
        int res = Integer.MAX_VALUE; 
        Arrays.sort(nums);
        // i = number of min numbers it will delete / modify
        for (int i = 0; i <= 3; i++) {
            res = Math.min(res, nums[nums.length-1 - (3-i)] - nums[i]);
        }
        return res;
    }
}