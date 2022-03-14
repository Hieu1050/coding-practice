import java.util.Random;

// 1-7 rotate matrix
// also leetcode: https://leetcode.com/problems/set-matrix-zeroes/
// Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.

// You must do it in place.

// Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
// Output: [[1,0,1],[0,0,0],[1,0,1]]

// Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
// Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]

public class ZeroMatrix {
    public static void main(String[] args) {
        int [][] m = generageMatrix(10, 10);
        printMatrix(m);
        System.out.println ();
        Solution(m);
        printMatrix(m);
    }
    public static void Solution (int[][] m){
        // 1- using the first row and first column to mark the location of 0 rows and columns
        // 2- we will check x and y axis later to perfrom nullification, so start scanning from the rest of matrix
        // 2a- note if there is 0's in the axis first
        boolean zero_in_x = false; boolean zero_in_y = false;
        for (int ix = 0; ix< m[0].length; ix++) {
            if (m[0][ix] ==0) {
                zero_in_x = true; break;
            }
        }
        for (int iy = 0; iy < m.length; iy++) {
            if (m[iy][0]==0){
                zero_in_y = true; break;
            }
        }
        // 3- scanning the rest of the axis, mark the location of 0 to the x and y axis
        for (int iy = 1; iy < m.length; iy++) {
            for (int ix = 1; ix < m[0].length; ix++) {
                if (m[iy][ix] == 0){
                    m[0][ix] = 0;
                    m[iy][0] = 0;
                }
            }
        }
        // 4a- nullify the rows
        for (int iy = 1; iy < m.length; iy++) {
            if (m[iy][0] ==0 ){
                for (int ix = 1; ix < m[0].length; ix++) {
                    m[iy][ix] = 0;
                }
            }
        }
        // 4b- nullify the columns
        for (int ix = 1; ix < m[0].length; ix++) {
            if (m[0][ix] == 0){
                for (int iy = 1; iy < m.length; iy ++){
                    m[iy][ix] = 0;
                }
            }
        }
        //5- nullify the axis
        if (zero_in_x){
            for (int ix = 0; ix < m[0].length; ix++) {
                m[0][ix] = 0;
            }
        }
        if (zero_in_y){
            for (int iy = 0; iy< m.length; iy ++){
                m[iy][0] = 0;
            }
        }
    }
    static int [][] generageMatrix (int M, int N){
        int [][] res = new int [M][N];
        Random r = new Random();
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                res[i][j] = r.nextInt(20);
            }
        }
        return res;
    }
    static void printMatrix (int [][] matrix){
        int M = matrix.length;
        int N = matrix[0].length;
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.printf("%d\t", matrix[i][j]);
            }
            System.out.println ();
        }
    }
}
