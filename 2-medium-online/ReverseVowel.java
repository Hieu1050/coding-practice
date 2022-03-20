public class ReverseVowel {
    public static void main(String[] args) {
        Solution("Hello");
    }
    static String Solution (String s){
        char [] str_char = s.toCharArray();
        String vowels = "ueoaiUEOAI";
        char tmp;
        int i_l = 0, i_r = s.length()-1;
        // scanning from both sides, stop when detecting the vowel
        outer: while (i_l < i_r){
            // scanning from left first
            while (true){
                if (existInString(vowels, str_char[i_l])) break;
                if (i_l >= i_r) break outer;
                i_l ++;
            }
            // scanning from right
            while (true){
                if (existInString(vowels, str_char[i_r])) break;
                if (i_r <=  i_l) break outer;
                i_r --;
            }
            // swapping 
            tmp = str_char[i_l];
            str_char[i_l] = str_char [i_r];
            str_char[i_r] = tmp;
            i_l++;
            i_r--;
        }
        return String.valueOf(str_char);

    }
    static boolean existInString(String s, char c){
        for (int i = 0; i < s.length(); i++) {
            if (c == s.charAt(i)) return true;
        }
        return false;
    }
}
