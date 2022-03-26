import java.util.Random;

public class NodeOperations {
    public Node generateNode (int range, int len){
        Random rand_int = new Random();
        Node res = new Node(rand_int.nextInt(range));
        for (int i = 0; i < len-1; i++) {
            res.appendTail(rand_int.nextInt(range));
        }
        return res;
    }
    public void printList (Node n){
        Node tmp = n;
        while (tmp != null){
            System.out.printf("%d -> ", tmp.val);
            tmp = tmp.next;
        }
        System.out.println ("null");
    }
    public Node deleteNote (Node node, int val){
        if (node == null) return null;
        if (node.val == val) return node.next;
        Node head = node;
        while (node.next != null){
            if (node.next.val == val) break;
            node = node.next;
        }
        node.next = node.next.next;
        return head;
    }
}
