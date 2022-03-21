import java.util.ArrayList;
import java.util.List;

public class RecursivePreorderTraversal {
    public List<Integer> preorderTraversal (TreeNode root){
        List <Integer> res = new ArrayList<>();
        Helper(root, res);
        return res;
    }
    static void Helper (TreeNode node, List<Integer> list){
        if (node != null){
            list.add(node.val);
            Helper(node.left, list);
            Helper(node.right, list);
        }
    }
}
