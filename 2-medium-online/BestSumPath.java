// DCP 122
// This question was asked by Zillow.

// You are given a 2-d matrix where each cell represents number of coins in that cell. Assuming we start at matrix[0][0], and can only move right or down, find the maximum number of coins you can collect by the bottom right corner.

// For example, in this matrix
// 0 3 1 1
// 2 0 0 4
// 1 5 3 1
// The most we can collect is 0 + 2 + 1 + 5 + 3 + 1 = 12 coins.
public class BestSumPath {
    public static void main(String[] args) {
        int[][] matrix = {{0, 3, 1, 1},{2, 0, 0, 4},{1, 5, 3, 1}};
        System.out.println (Solution(matrix));
    }
    public static int Solution (int [][] matrix){
        // 0- get the matrix size
        int h = matrix.length;
        int w = matrix[0].length;
        // 1- init dp[][]
        int [][] dp = new int[h][w];
        dp[0][0] = matrix[0][0];
        // 1b- init first row and column
        for (int yi = 1; yi < h; yi++) {
            dp[yi][0] = matrix[yi][0] + dp[yi-1][0];
        }
        for (int xi = 1; xi < w; xi++) {
            dp[0][xi] = matrix[0][xi] + dp[0][xi-1];
        }
        // 2- while running through matrix 
        for (int yi = 1; yi < h; yi++) {
            for (int xi = 1; xi < w; xi++) {
                dp[yi][xi] = (dp[yi-1][xi] >= dp[yi][xi-1]) ?
                    matrix[yi][xi] + dp[yi-1][xi] 
                    : matrix[yi][xi] + dp[yi][xi-1];
            }
        }
        return dp[h-1][w-1];
    }
}
