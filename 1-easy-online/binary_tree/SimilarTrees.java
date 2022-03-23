/*
Given the roots of two binary trees p and q, write a function to check if they are the same or not.

Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.

*/

package binary_tree;

public class SimilarTrees {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // null node 
        if (p == null && q == null) return true;
        // value and null
        if ((p == null && q!= null) || (p != null && q== null)) return false;
        // different values
        if (p.val != q.val) return false;
        // different childrent
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
