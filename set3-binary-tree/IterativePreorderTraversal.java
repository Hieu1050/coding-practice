import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class IterativePreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack <TreeNode> node_stack = new Stack<TreeNode>();
        List<Integer> res = new ArrayList<>();
        
        if (root == null) return res;
        node_stack.push (root);
        while (!node_stack.isEmpty()){
            TreeNode parent_node = node_stack.pop();
            res.add(parent_node.val);
            if (parent_node.right != null) node_stack.push(parent_node.right);
            if (parent_node.left != null) node_stack.push(parent_node.left);
        }
        return res;
    }
}
