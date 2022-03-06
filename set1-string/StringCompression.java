public class StringCompression {
    public static void main(String[] args) {
        System.out.println ("abcd:\t" + Solution("abcd"));
        System.out.println ("abbcccdddd:\t" + Solution("abbcccdddd"));
    }
    static String Solution (String s){
        if (s.length()== 0) {return s;}
        int s_len = s.length();
        if (s_len < compressLength(s, s_len)){return s;}

        StringBuilder res = new StringBuilder();
        int count =0;
        for (int i = 0; i < s_len ; i++) {
            count ++;
            // if the next char is not the same OR cur char is the last char
            if (i == s_len-1 || s.charAt(i+1) != s.charAt(i)) {
                // add curr char to res
                res.append(s.charAt(i));
                // add count to res
                res.append(Integer.toString(count));
                // reset count
                count = 0;
            }
        }
        return res.toString();

    }
    static int compressLength (String s, int s_len){
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i == s_len-1 || s.charAt(i+1) != s.charAt(i)){
                count += 2;
            }
        }
        return count;
    }
}
