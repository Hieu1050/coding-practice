public class Main {
    public static void main(String[] args) {
        Node h = new Node (1);
        for (int i = 2; i < 10; i++) {
            h.appendNode(i);
        }
        h.printList ();
    }
}
