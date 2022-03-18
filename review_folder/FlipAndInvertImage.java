public class FlipAndInvertImage {
    public int[][] flipAndInvertImage(int[][] image) {
        int h = image.length;
        int w = image[0].length;
        int tmp;
        // flip the image
        for (int yi = 0; yi < h; yi++) {
            int xi_l = 0, xi_r = w-1;
            while (xi_l < xi_r){
                tmp = image[yi][xi_l];
                image[yi][xi_l] = image[yi][xi_r];
                image[yi][xi_r] = tmp;
                xi_l++;
                xi_r--;
            }
        }
        // invert image 
        for (int yi = 0; yi < h; yi++) {
            for (int xi = 0; xi < w; xi++) {
                image[yi][xi] = 1- image[yi][xi];
            }
        }
        return image;
    }
}
