public class CountOnes {
    public static void main(String[] args) {
        
    }
    public int hammingWeight(int n){
        int count = 0;
        for (int i = 0; i < 31; i++) {
            if ( (1 << i & n) > 0) {count++;}
            
        }
        return count;
    }
}
