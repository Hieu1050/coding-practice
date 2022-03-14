// Pinterest
// You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your MAXIMUM jump length at that position.
// Return true if you can reach the last index, or false otherwise.
// https://leetcode.com/problems/jump-game/

// Input: nums = [2,3,1,1,4]
// Output: true
// Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.

// Input: nums = [3,2,1,0,4]
// Output: false
// Explanation: You will always arrive at index 3 no matter what. Its maximum jump length is 0, which makes it impossible to reach the last index.
public class Hops {
    public static void main(String[] args) {
        
    }
    public static boolean Solution (int [] hops){
        // base case [0]
        // if i reaches the end of list: return true
        int furthest_i = 0;
        int last_i = hops.length -1;
        for (int i = 0; i < hops.length; i++) {
            // update furthest_i;
            if (hops[i] != 0 ){
                furthest_i = (furthest_i > (i+ hops[i])) ? furthest_i : (i+ hops[i]);
                if (furthest_i >= last_i){
                    return true;
                }
            }
            else {
                if (furthest_i <= i && i!= last_i) {
                    return false;
                }
            }
        }
        return true;
    }            
}
