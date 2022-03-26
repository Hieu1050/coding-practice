public class RemoveDupNode {
    public static void main(String[] args) {
        NodeOperations nodeOperations = new NodeOperations();
        Node n1 = nodeOperations.generateNode(5, 20);
        nodeOperations.printList(n1);
        removeDupNode (n1);
        nodeOperations.printList(n1);
    }
    public static void removeDupNode (Node root){
        Node head = root; 
        Node tail;
        while (head != null) {
            tail = head;
            while (tail.next != null){
                if (tail.next.val == head.val) tail.next = tail.next.next;
                else tail = tail.next;
            }
            head = head.next;
        }
    }
}
