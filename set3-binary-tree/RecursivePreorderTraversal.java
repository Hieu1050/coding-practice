import java.util.ArrayList;
import java.util.List;

public class RecursivePreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res= new ArrayList<>();
        helper(root, res);
        return res;
    }
    static void helper (TreeNode node, List<Integer> lst){
        if (node != null){
            lst.add(node.val);
            helper(node.left, lst);
            helper(node.right, lst);
        }
    }
}
