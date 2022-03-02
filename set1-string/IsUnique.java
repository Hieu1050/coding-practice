// No 1-1
// Implement an algorithm to determine if a string have all unique charaters
public class IsUnique {
    public static void main(String[] args) {
        System.out.println (Solution("abcv"));
    }
    public static boolean Solution (String s){
        int bit_vector = 0 ;
        for (int i = 0; i < s.length(); i++) {
            if ((bit_vector & (1 << s.charAt(i)) ) >1) {
                return false;
            }
            bit_vector |= (1 << (s.charAt(i)-'a'));
        }
        return true;
    }
}
                                                                                                                                       