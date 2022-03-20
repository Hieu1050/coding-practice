public class RepeatedSubStringPattern {
    public static void main(String[] args) {
        repeatedSubstringPattern("ababab");
    }
    public static boolean repeatedSubstringPattern (String s){
        int s_len = s.length();
        // 0 - base case
        if (s_len== 1) return false;
        // 1 - find the longest substring length
        for (int sub_s_len = s_len/2; sub_s_len > 0; sub_s_len--) {
            // 2 - if the current substring length works, check if the substring of that length work
            if (s_len % sub_s_len == 0){
                String sub_s = s.substring(0, sub_s_len);
                int sub_s_i =1;
                while (sub_s_i <= s_len/ sub_s_len -1){
                    if (!s.substring(sub_s_i * sub_s_len, sub_s_i * sub_s_len+ sub_s_len).equals(sub_s)){
                        break;
                    }
                    // if the last sub_string matches the pattern, return true
                    if (sub_s_i == s_len/ sub_s_len -1) return true;
                    sub_s_i ++;
                }
            }
            // 3 - if the divisor reaches 1 and it still not work, return false
        }
        return false;
    }
}
