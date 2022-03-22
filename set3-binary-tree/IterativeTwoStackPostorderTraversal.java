import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class IterativeTwoStackPostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        // base case
        if (root == null) return res;
        Stack<TreeNode> latest_parent = new Stack<>();
        Stack<TreeNode> visited_nodes = new Stack<>();

        latest_parent.push(root);
        TreeNode curr; 
        while (!latest_parent.isEmpty()){
            curr = latest_parent.pop();
            visited_nodes.push(curr);
            if (curr.left != null) latest_parent.push(curr.left);
            if (curr.right != null) latest_parent.push (curr.right);
        }

        while (!visited_nodes.isEmpty()){
            curr = visited_nodes.pop();
            res.add(curr.val);
        }
        return res;
    }
}
