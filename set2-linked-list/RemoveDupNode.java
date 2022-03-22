// remove duplicate value from unsorted linked list, without using temporary buffer

public class RemoveDupNode {
    public static void main(String[] args) {
        NodeOperations nodeOperations = new NodeOperations();
        Node n1 = nodeOperations.generateNode(5, 10);
        nodeOperations.printList(n1);
        removeDupNode (n1);
        nodeOperations.printList(n1);
    }
    public static void removeDupNode(Node node){
        Node head = node; Node tail;
        while (head != null){
            System.out.println ("current:" + head.val);
            tail = head;
            while (tail.next != null){
                if (tail.next.val == head.val){
                    tail.next = tail.next.next;                 
                }
                else tail = tail.next;
            }
            head= head.next;
        }
    }
}
