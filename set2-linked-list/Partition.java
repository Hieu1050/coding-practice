public class Partition {
    public static void main(String[] args) {
        NodeOperations o = new NodeOperations();
        Node n1 = o.generateNode(10, 10);
        o.printList(n1);
        o.printList(partition(n1, 5));
    }
    public static Node partition(Node root, int k){
        Node head = root, tail = root;
        Node curr;
        if (head.next == null) return head;
        curr = head.next;
        // while iterating through the list from the second node
        while (curr != null){
            Node next_node = curr.next;
            // if the current node is less than k, add node to the head and update the head node
            if (curr.val < k) {
                curr.next = head;
                head = curr;
            }
            // else add node to the tail and update the tail node
            else {
                tail.next = curr; 
                tail = tail.next;
            }
            curr = next_node;
        }
        tail.next = null;
        return head;
    }
}
