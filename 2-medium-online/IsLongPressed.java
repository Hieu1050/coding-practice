public class IsLongPressed {
    public static void main(String[] args) {
        isLongPressedName("alex", "aaleex");
    }
    public static boolean isLongPressedName(String name, String typed) {
        int name_len = name.length();
        int typed_len = typed.length();
        //base case 
        if (name_len > typed_len) return false;
        // init 2 pointers
        int i1 = 0, i2 = 0;
        char curr_char;
        int char_cnt_name, char_cnt_typed;
        // while traversing until the end of name and typed
        while (i1 < name_len && i2 < typed_len){
            if (name.charAt(i1) != typed.charAt(i2)) return false;
            // when the char matched, count the number of consecutive char in name and typed
            curr_char = name.charAt(i1);
            char_cnt_name = 0; char_cnt_typed = 0;
            while (i1 < name_len && name.charAt(i1) == curr_char) {
                i1++;
                char_cnt_name++;
            }
            while (i2 < typed_len && typed.charAt(i2) == curr_char){
                i2++;
                char_cnt_typed ++;
            }
            if (char_cnt_name > char_cnt_typed) return false;

        }

        // if both pointers traverse till the end: return TRUE
        if (i1 == name_len - 1 && i2 == typed_len -1) return true;
        return false;
    }
}
