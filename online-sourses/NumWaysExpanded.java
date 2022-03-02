// There's a staircase with N steps, and you can climb 1 or 2 steps at a time. Given N, write a function that returns the number of unique ways you can climb the staircase. The order of the steps matters.
// For example, if N is 4, then there are 5 unique ways:

// 1, 1, 1, 1
// 2, 1, 1
// 1, 2, 1
// 1, 1, 2
// 2, 2
// What if, instead of being able to climb 1 or 2 steps at a time, you could climb any number from a set of positive integers X? For example, if X = {1, 3, 5}, you could climb 1, 3, or 5 steps at a time. Generalize your function to take in X.

// assuming: 
// (1) X is sorted
// (2) if the min range is larger than the number of step, return 0
public class NumWaysExpanded {
    public static void main(String[] args) {
        int []X = {2,3};
        System.out.println (Solution(5, X));
    }
    static int Solution (int N, int []X){ // assuming that X is sorted
        int [] dp = new int [N+1];
        // base case
        dp [0] = 1;
        dp [X[0]] = 1;
        for (int i = X[0]; i <= N ; i++) {
            for (int x : X) {
                if (i-x >= 0) {
                    if (dp[i-x] == 0){
                        dp[i] = 0; break;
                    }
                    else {dp[i] += dp[i-x];}
                }
            }
        }
        return dp[N];
    }
}
