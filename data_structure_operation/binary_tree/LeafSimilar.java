package binary_tree;

import java.util.ArrayList;
public class LeafSimilar {
    static boolean leafSimilar(TreeNode root1, TreeNode root2){
        ArrayList <Integer> leaves1 = new ArrayList<>();
        ArrayList <Integer> leaves2 = new ArrayList<>();
        helper(root1, leaves1);
        helper(root2, leaves2);
        return leaves1.equals(leaves2);
    }
    static void helper (TreeNode node, ArrayList<Integer> leaves){
        // if node is leaf
        if (node.left == null && node.right == null){
            leaves.add (node.val);
        }
        else {
            if (node.left != null) {
                helper(node.left, leaves);
            }
            if (node.right != null){
                helper(node.right, leaves);
            }
        }
    }

}
