import java.util.HashMap;

// https://leetcode.com/problems/two-sum/
// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.

// You can return the answer in any order.

// Constraints:

// 2 <= nums.length <= 104
// -109 <= nums[i] <= 109
// -109 <= target <= 109
// Only one valid answer exists.
public class TwoSum {
    public static void main(String[] args) {
        
    }
    public static int[] Solution (int [] nums, int target){
        HashMap <Integer, Integer> cpmt_map = new HashMap<Integer, Integer>();
        // <complement-value, index-of-that-complement>
        //complement
        int cpmt;
        for (int i = 0; i < nums.length; i++) {
            cpmt = target - nums[i];
            if (cpmt_map.containsKey(cpmt)) {
                return new int [] {cpmt_map.get(cpmt), i};
            }
            cpmt_map.put (nums[i], i);
        }
        throw new IllegalArgumentException("no match found");
    }
}
