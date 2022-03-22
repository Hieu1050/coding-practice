public class Operations {
    public void printList (Node n){
        while (n != null){
            System.out.printf("%d -> ", n.val);
            n = n.next;
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
