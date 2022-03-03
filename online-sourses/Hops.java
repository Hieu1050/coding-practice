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
        int [] hops =  {0};
        System.out.println (Solution(hops));
    }
    public static boolean Solution (int []hops ){
        int max_i = 0; // the furthest possible index
        int max_0 = 0; // the furthest 0 index
        
        int i = 0;
        while (i <= hops.length-1) {
            // if hops[i] != 0: evaluate max_i
            if (hops[i] != 0){
                if (i + hops[i]  > max_i) {
                    max_i = i + hops[i];
                }

                i ++;
            }
            // if hops[i] == 0: find the furthest position of 0
            else {
                max_0 = i;
                i ++ ;

            }
            // evaluate if can jump pass max_0: pass
            if (max_i >= hops.length -1) {
                return true;
            }
            else if (!(max_i > max_0)) {
                return false;
            }               
        }
        return true;
    }
}
