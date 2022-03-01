// source https://www.youtube.com/watch?v=QtEtcXPqRPk

public class BinaryStringAddition {
    public static void main(String[] args) {
        System.out.println (Solution ("111", "1"));
    }

    public static String Solution (String b1, String b2){
        StringBuffer res = new StringBuffer();
        int pointer = 0;
        int carry = 0;
        int shorter_len = (b1.length() <= b2.length()) ? b1.length() :b2.length();
        while (pointer <= shorter_len - 1){
            // do calculation   
            // if carry == 0
            if (carry == 0 ){
                if (b1.charAt(pointer) != b2.charAt(pointer)){
                    res.append('1');
                }
                else {
                    if (b1.charAt(pointer) == '1'){
                        res.append('0');
                        carry = 1;
                    }
                    else {
                        res.append('0')  ;
                    }
                                         
                }
                }
            else {
                if (b1.charAt(pointer) != b2.charAt(pointer)){
                    res.append('0');
                }
                else {
                    if (b1.charAt(pointer)== 1){
                        res.append('1');
                    }
                    else {
                        res.append('1');
                    }
                }
            }
            pointer ++;
        }
        if (b1.length() > b2.length()){
            res.append( b1.substring(shorter_len, b1.length()));
        }
        else if (b1.length() < b2.length()) {
            res.append( b2.substring(shorter_len, b2.length()));
        }
        if (carry == 1){
            res.append('1');
        }

        res.reverse();
        return res.toString();
    }
}