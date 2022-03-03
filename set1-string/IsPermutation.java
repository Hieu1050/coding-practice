public class IsPermutation {
    public static void main(String[] args) {
        System.out.println (Solution("abca", "bcxa"));
    }
    public static boolean Solution (String a, String b) {
        if (a.length() != b.length()) { return false;}

        int [] freq_map = new int [26];
        for (int i = 0; i < a.length(); i++) {
            freq_map[a.charAt(i) - 'a'] ++;
        }
        for (int i = 0; i < a.length(); i++) {
            freq_map[b.charAt(i) - 'a'] --;
            if (freq_map[b.charAt(i) - 'a'] < 0){
                return false;
            }
        }
        return true;
    }
}
