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

}
