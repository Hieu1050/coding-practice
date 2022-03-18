import java.util.ArrayList;
import java.util.List;

public class commonChars {
    public static void main(String[] args) {
        
    }
    public List<String> Solution(String[] words) {
        // base case
        
        List<String> res = new ArrayList<String> ();
        if (words.length ==1 ) return res;
        int freq_map[] = new int [26];
        int curr_map[] = new int [26];
        // first word
        for (int i = 0; i < words[0].length(); i++) {
            freq_map[words[0].charAt(i)-'a'] ++;
        }

        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                // if the char is completely new; pass
                // if the char exist in the map
            }
        }
    }
}
