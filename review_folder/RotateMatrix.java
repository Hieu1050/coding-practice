public class RotateMatrix {
    public void rotate(int[][] matrix) {
        // base case
        if (matrix.length <= 1) return;
        // 1- flip the matrix along the x = y region
        int xi, yi;
        int tmp;
        for (xi = 1; xi< matrix.length; xi++){
            for (yi = 0; yi < xi; yi++){
                tmp = matrix[yi][xi];
                matrix[yi][xi] = matrix[xi][yi];
                matrix[xi][yi] = tmp;
            }
        }
        // 2- flip the matrix horizontally
        for (yi = 0; yi< matrix.length; yi++){
            for (xi =0; xi < matrix.length/2; xi ++){
                tmp = matrix[yi][xi];
                matrix[yi][xi] = matrix[yi][matrix.length-1 -xi];
                matrix[yi][matrix.length-1 -xi] = tmp;
            }
        }
    }
}
