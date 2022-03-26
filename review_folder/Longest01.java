import java.util.HashMap;

public class Longest01 {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> frontmost_csum_idx = new HashMap<>();
        frontmost_csum_idx.put(-1, 0);
        int csum = 0;
        int res_max_len = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) csum ++;
            else csum --;
            if (frontmost_csum_idx.containsKey(csum)) {
                res_max_len = Math.max (res_max_len, i- frontmost_csum_idx.get(csum));
            }
            else frontmost_csum_idx.put(csum, i);
        }
        return res_max_len;
    }
}
