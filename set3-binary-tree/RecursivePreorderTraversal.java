import java.util.ArrayList;
import java.util.List;

public class RecursivePreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        helper (root, res);
        return res;
    }
    static void helper (TreeNode node, List<Integer> list){
        if (node != null){
            list.add(node.val);
            helper (node.left, list);
            helper (node.right, list);
        }
    }
}
