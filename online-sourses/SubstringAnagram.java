import java.util.ArrayList;
// daily coding problem 111: https://www.dailycodingproblem.com/solution/111?token=14e37efc0a8f385f870615113a9bd39fab796c1bb1a923d7da29b2b8c443edb7a29b4ef2
// This problem was asked by Google.
// Given a word W and a string S, find all starting indices in S which are anagrams of W.
// For example, given that W is "ab", and S is "abxaba", return 0, 3, and 4.

// assumming that the possible chars in within the alphabet
public class SubstringAnagram {
    public static void main(String[] args) {
        ArrayList <Integer> res  = Solution("ab", "abxaba"); // [0, 1, 2]
        System.out.println (res.toString());
    }
    public static ArrayList <Integer> Solution (String W, String S) {
        ArrayList <Integer> res = new ArrayList<Integer>();
        // freq map for W
        int [] fmap_W = new int [26];
        for (int i = 0; i < W.length(); i++) {
            fmap_W [W.charAt(i) - 'a'] ++;
        }
        // init a sliding window sw for S
        char prev_char = S.charAt(0);
        // init a freq map for sw
        int [] fmap_S = new int [26];
        for (int i = 0; i < W.length(); i++) {
            fmap_S [W.charAt(i) - 'a'] ++;
        }
        // check matching at first position
        if (compare_fmap(fmap_W, fmap_S)){
            res.add(0);
        }
        // for each position of the sliding window in S
        for (int i = 1; i <= S.length()-W.length(); i++) {
            // update freq map for sw
            fmap_S [prev_char - 'a'] --;
            fmap_S [S.charAt(i+ W.length()-1) - 'a'] ++;
            // compare 2 sliding widows
            if (compare_fmap(fmap_W, fmap_S)) {
                // append indices if matches
                res.add (i);
            }
            // update prev_char
            prev_char = S.charAt(i); // ERROR HERE
        }
        return res;
    }
    static boolean compare_fmap (int [] mapA, int [] mapB){
        for (int i = 0; i < mapB.length; i++) {
            if (mapA[i]!= mapB[i]){
                return false;
            }
        }
        return true;
        
    }
    
}
