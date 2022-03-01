// There's a staircase with N steps, and you can climb 1 or 2 steps at a time. Given N, write a function that returns the number of unique ways you can climb the staircase. The order of the steps matters.
// For example, if N is 4, then there are 5 unique ways:

// 1, 1, 1, 1
// 2, 1, 1
// 1, 2, 1
// 1, 1, 2
// 2, 2
// What if, instead of being able to climb 1 or 2 steps at a time, you could climb any number from a set of positive integers X? For example, if X = {1, 3, 5}, you could climb 1, 3, or 5 steps at a time. Generalize your function to take in X.

public class NumWays {
    public static void main(String[] args) {

        System.out.println (Solution1(4));
        System.out.println (Solution2(4));
    }
    public static int Solution1 (int N){
        if (N == 0 || N == 1) {return 1;}
        else {
            return 
                (Solution1 (N-1) + Solution1 (N-2));
            
        }
    }
    public static int Solution2 (int N){
        int res  = 0;
        int max_num_of_2s = N/2;
        for (int i = 0; i <= max_num_of_2s; i++) {
            res += factorial(N-i*2 + i) / (factorial(N - i*2) * factorial (i));
        }
        return res;
    }
    static int factorial (int x){
        int res = 1;
        if (x == 0 ){
            return res;
        }
        else{
            for (int i = 2; i <= x; i++) {
                res *= i;
            }
        }
        return res;
    }
}
