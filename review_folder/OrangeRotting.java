public class OrangeRotting {
    public static void main(String[] args) {
        int [][]dp = new int[5][5];
        System.out.println (dp[0][0]);
    }
    public static int Solution (int[][] grid){
        int count;
        int h = grid.length;
        int w = grid[0].length;
        int [][]dp = new int [h][w];
        for (int i = 0; i<= 10 ; i++) {
            for (int yi = 0; yi < h; yi++) {
                for (int xi = 0; xi < w; xi++) {
                    // if orange is rotten, surrouding grid will turn rotten in 1 min

                    // if dp[][] >= 1, update surrounding grid 
                }
            }
        }

    }
}
