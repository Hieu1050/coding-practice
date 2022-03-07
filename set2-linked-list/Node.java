public class Node {
    Node next = null;
    int data; 
    public Node (int data){
        this.data = data;
    }
    void appendNode (int data){
        Node end = new Node(data);
        Node n = this;
        while (n.next != null){
            n = n.next;
        }
        n.next = end;
    }
}
