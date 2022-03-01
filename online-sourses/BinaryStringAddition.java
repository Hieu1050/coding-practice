// source https://www.youtube.com/watch?v=QtEtcXPqRPk

public class BinaryStringAddition {
    public static void main(String[] args) {
        System.out.println (Solution ("111", "1"));
    }

    public static String Solution (String b1, String b2){
        StringBuffer res = new StringBuffer();
        int pointer = 0;
        int carry = 0;
        int count_ones = 0;
        String s_long, s_short;
        if (b1.length() > b2.length()){
            s_long = b1;
            s_short = b2;
        }
        else {s_long = b2; s_short = b1;}


        int longer_len = s_long.length();
        while (pointer <= longer_len - 1){
            // do calculation   
            // count the number of 1 bit
            if (carry == 1){ count_ones ++;}
            if (s_long.charAt(pointer) == '1'){count_ones ++;}
            if (pointer <= s_short.length()-1 && b2.charAt(pointer) == '1'){count_ones ++;}
            // evaluate count_ones
            if (count_ones % 2 == 0){
                res.append('0');
            } else {
                res.append('0');
            }
            if (count_ones > 1) {carry =1;}
            else {carry = 0;}

            count_ones = 0;
            pointer ++;
        }

        if (carry == 1){
            res.append('1');
        }

        res.reverse();
        return res.toString();
    }
}