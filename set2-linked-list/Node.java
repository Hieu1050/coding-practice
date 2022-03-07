public class Node {
    Node next = null;
    int data; 
    public Node (int data){
        this.data = data;
    }

    public void printList (){
        Node n = this;
        while (n != null){
            System.out.printf("%d -> ", n.data);
            n = n.next;
        }
        System.out.println ("null");
    }

    public void appendNode (int data){
        Node end = new Node(data);
        Node n = this;
        while (n.next != null){
            n = n.next;
        }
        n.next = end;
    }
}
