import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreorderTraverse {
    public List<Integer> preorderTraversal(TreeNode root) {
        // basecase 
        List <Integer> res = new ArrayList<>();
        if (root == null ) return res;
        Stack <TreeNode> node_stack = new Stack<>();
        TreeNode curr = root;
        node_stack.push(curr);
        while (!node_stack.isEmpty()){
            curr = node_stack.pop();
            res.add(curr.val);
            if (curr.right != null) node_stack.push(curr.right);
            if (curr.left != null) node_stack.push(curr.left);
        }
        return res;
    }
}
