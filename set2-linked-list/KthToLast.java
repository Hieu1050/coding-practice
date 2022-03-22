// return the kth to last element of a singly linked list

public class KthToLast {
    public static void main(String[] args) {
        NodeOperations o = new NodeOperations();
        Node n1 = o.generateNode(15, 7);
        o.printList(n1);
        Node n_x = kthToLastNode(n1, 1);
        System.out.println (n_x.val);
        n_x = kthToLastNode(n1, 3);
        System.out.println (n_x.val);
        
    }
    public static Node kthToLastNode (Node node, int k){
        Node front = node, back = node;
        for (int i = 0; i<k; i++){
            if (back == null) return null;
            back = back.next;
        }
        while (back != null){
            front = front.next;
            back = back.next;
        }
        return front;
    }
}
