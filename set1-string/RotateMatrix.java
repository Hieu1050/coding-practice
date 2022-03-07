import java.util.Random;

public class RotateMatrix {
    public static void main(String[] args) {
        int [][] m1 = generageMatrix(5);
        printMatrix(m1, 5);
        System.out.println ();
        transposeMatrix(m1);
        printMatrix(m1, 5);
        System.out.println ();
        verticalFlipMatrix(m1);
        printMatrix(m1, 5);

    }
    static void transposeMatrix (int [][]matrix){
        int N = matrix.length;
        for (int i = 0; i < N; i++) { // height
            for (int j = i; j < N; j++) { // width
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
    }
    static void verticalFlipMatrix (int [][]matrix){
        int width = matrix[0].length;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < width/2; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[i][width-j-1];
                matrix[i][width-j-1] = tmp;
            }
        }

    }
    static int [][] generageMatrix (int N){
        int [][] res = new int [N][N];
        Random r = new Random();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                res[i][j] = r.nextInt(20);
            }
        }
        return res;
    }
    static void printMatrix (int [][] matrix, int size){
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.printf("%d\t", matrix[i][j]);
            }
            System.out.println ();
        }
    }
}
