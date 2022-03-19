public class RomanConvert {
    public static int Solution (String s){
        int res = 0;
        char prev_char = '-';
        for (int i =  s.length()-1; i>=0 ;  i--) {
            switch (s.charAt(i)){
                case 'I':
                    if (prev_char == 'V' || prev_char == 'X' ) res -= 1;
                    else res ++;
                    prev_char = s.charAt(i);
                    break;
                case 'V':
                    res += 5;
                    prev_char = s.charAt(i);
                    break;
                case 'X':
                    if (prev_char == 'L' || prev_char == 'C') res -= 10;
                    else res +=10;
                    prev_char = s.charAt(i);
                    break;
                case 'L': 
                    res += 50;
                    prev_char = s.charAt(i);
                    break;
                case 'C':
                    if (prev_char == 'D' || prev_char == 'M') res -= 100;
                    else res += 100;
                    prev_char = s.charAt(i);
                    break;
                case 'D':
                    res += 500;
                    prev_char = s.charAt(i);
                    break;
                case 'M':
                    res += 1000;
                    prev_char = s.charAt(i);
                    break;
            }
        }
        return res;
    }
}

