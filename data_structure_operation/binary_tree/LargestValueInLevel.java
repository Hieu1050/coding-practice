package binary_tree;

import java.util.ArrayList;
import java.util.List;

public class LargestValueInLevel {
    public static List<Integer> largestValues(TreeNode root) {
        // base case
        if (root == null) return new ArrayList<>();
        List<Integer> res = new ArrayList<Integer>();
        res.add (root.val);
        helper(0, res, root);
        return res;
    }
    static void helper (int level, List<Integer> max_row_val, TreeNode node){
        if ( node!= null){
            max_row_val.set(level, Math.max(max_row_val.get(level).intValue(), node.val)) ;
            if (node.left != null || node.right != null) {
                if (max_row_val.size() <= level + 1){
                    if (node.left != null) max_row_val.add(node.left.val);
                    else max_row_val.add(node.right.val);
                }
                level ++;
                helper(level, max_row_val, node.left);
                helper(level, max_row_val, node.right);
            }
        }
        
    }

}
