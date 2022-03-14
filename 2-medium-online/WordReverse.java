// This problem was asked by Google.

// Given an input string s, reverse the order of the words.
// A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
// Return a string of the words in reverse order concatenated by a single space.
// Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.

// more: https://leetcode.com/problems/reverse-words-in-a-string/
public class WordReverse {
    public static void main(String[] args) {
        System.out.println (Solution("    hello world here    "));
    }
    static String Solution (String s){
        StringBuffer res = new StringBuffer(); 
        String [] words = s.replaceFirst("^\\s+","").split("\\s+",0);
        int end = words.length -1;
        for (int i = 0; i < words.length; i++) {
            res.insert(0, words[i]);
            if (i < end){
                res.insert(0, " ");
            }
        }
        return res.toString();
    }
}
