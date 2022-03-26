import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InorderTraverse {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;
        Stack<TreeNode> node_stack = new Stack<>();
        TreeNode curr = root;
        while (curr != null || !node_stack.isEmpty()){
            while (curr != null){
                node_stack.push(curr);
                curr = curr.left;
            }
            curr = node_stack.pop();
            res.add(curr.val);
            if (curr.right != null) {
                curr = curr.right;
            }
        }
        return res;
    }
}
