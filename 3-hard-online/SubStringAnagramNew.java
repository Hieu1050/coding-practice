// hashmap implementation of SubstingAnagram, actually seems not that faster

import java.util.ArrayList;
import java.util.HashMap;

public class SubStringAnagramNew {
    public static void main(String[] args) {
        ArrayList <Integer> res  = Solution ("abcab", "ab"); // [0, 1, 2]
        System.out.println (res.toString());
    }
    public static ArrayList <Integer> Solution (String S, String W){
        ArrayList <Integer> res = new ArrayList<Integer>();
        if (W.length() > S.length()){
            return res;
        }
        HashMap <Character, Integer> fmap_W = new HashMap<Character, Integer>();
        HashMap <Character, Integer> fmap_S = new HashMap<Character, Integer>();
        // init the freqmap 
        for (int i = 0; i < W.length(); i++) {
            fmap_S.put (S.charAt(i), fmap_S.getOrDefault(S.charAt(i), 0) +1);
            fmap_W.put (W.charAt(i), fmap_W.getOrDefault(W.charAt(i), 0) +1);
        }
        boolean prev_match = false; 
        if (fmap_S.equals(fmap_W)) {
            prev_match = true;
            res.add(0);
        }

        for (int i = 1; i <= S.length() - W.length(); i++) {
            // if old char equals new char
            if (S.charAt(i-1) == S.charAt(i+ W.length()-1)){
                if (prev_match){ 
                    res.add(i);
                }
            }
            // else if old char does not equal new char
            else {
                // if the old character occurs only once in fmap_s, REMOVE THE KEY SO THE COMPARISION OF 2 MAPS IS VALID
                if (fmap_S.get(S.charAt(i-1)) == 1) {
                    fmap_S.remove(S.charAt(i-1));
                }
                else {
                    fmap_S.put(S.charAt(i-1), fmap_S.get(S.charAt(i-1)) -1);
                }
                fmap_S.put(S.charAt(i+ W.length()-1), fmap_S.getOrDefault(S.charAt(i+ W.length()-1),0) +1);
                if (fmap_S.equals(fmap_W)){
                    prev_match = true;
                    res.add (i);
                }
                else {prev_match = false;}
            }
            for (var entry : fmap_S.entrySet()) {
                System.out.println(entry.getKey() + ":" + entry.getValue());
            }
            System.out.println ();
        }
        return res;
    }
}
