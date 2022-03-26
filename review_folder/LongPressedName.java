public class LongPressedName {
    public boolean isLongPressedName(String name, String typed) {
        // base case 
        if (name.length() > typed.length()) return false;
        // 
        int i_name = 0, i_typed = 0;
        char curr_char;
        int c_name_cnt, c_typed_cnt;
        while (i_name < name.length() && i_typed < typed.length()){
            curr_char = name.charAt(i_name);
            if (curr_char !=  typed.charAt(i_typed)) return false;
            c_name_cnt = 0; c_typed_cnt = 0;
            while (i_name < name.length()){
                if (curr_char != name.charAt(i_name)) break;
                c_name_cnt ++;
                i_name ++;
            }
            while (i_typed < typed.length()){
                if (curr_char != typed.charAt(i_typed)) break;
                c_typed_cnt ++;
                i_typed ++;
            }
            if (c_name_cnt > c_typed_cnt) return false;
        }
        if (i_name == name.length() && i_typed == typed.length()) return true;
        return false;
    }
}
