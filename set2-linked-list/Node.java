public class Node {
    Node next = null;
    int val; 
    public Node (int val){
        this.val = val;
    }
    public void appendTail (int val){
        Node end = new Node(val);
        Node n = this;
        while (n.next != null){
            n = n.next;
        }
        n.next = end;
    }
    public static void removeDupNode(Node node){
        if (node == null) return ;
        if (node.next == null) return;
        Node head = node; Node tail;
        while (head.next != null){
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
    public static void main(String[] args) {
        Node n1 = new Node (0);
        int [] lst = {1,2,3,4,4,3,2,2,4,1};
        for (int i : lst) {
            n1.appendTail(i);
        }
        removeDupNode(n1);
    }
}
