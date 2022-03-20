public class SpiralMatrix {
    public static void main(String[] args) {
        int [] arr = new int [3];
        System.out.println (arr[1]);
    }
    static int [][] Solution (int n){
        // 4 corner bounds
        int [][] res = new int[n][n];
        int x_l = 0, x_r = n-1;
        int y_t = 0, y_b = n-1;
        int val = 1;
        while (! (x_l > x_r)){
            // top
            for (int xi = x_l; xi <= x_r; xi++) {
                res[y_t][xi] = val;
                val ++;
            }
            // right
            for (int yi = y_t+1; yi <= y_b; yi++){
                res[yi][x_r] = val;
                val++;
            }
            // bottom
            for (int xi = x_r-1; xi >= x_l; xi--){
                res[y_b][xi] = val;
                val++;
            }
            // left
            for (int yi = y_b-1; yi < y_t; yi--){
                res[yi][x_l] = val;
                val++;
            }

            //update corners
            x_l ++;
            x_r--;
            y_t--;
            y_b--;
        }
        return res;
    }
}
