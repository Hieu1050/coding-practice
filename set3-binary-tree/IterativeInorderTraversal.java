import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class IterativeInorderTraversal {
    public List <Integer> inorderTraversal(TreeNode root){
        List <Integer> res = new ArrayList<>();
        // base case
        if (root == null) {return res;};
        // initial
        Stack <TreeNode> node_stack = new Stack<TreeNode>();
        TreeNode curr = root;
        while (curr != null || !node_stack.isEmpty()){
            // traverse all the left node while adding it to stack
            while (curr != null){
                node_stack.push(curr);
                curr = curr.left;
            }
            // get the last left node from stack, add to the list
            curr = node_stack.pop();
            res.add(curr.val);
            // set the curr node to its right node
            curr = curr.right;
        }
        return res;
    }

}
