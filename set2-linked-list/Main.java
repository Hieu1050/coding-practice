public class Main {
    public static void main(String[] args) {
        Node h = new Node (1);
        for (int i = 2; i < 10; i++) {
            h.appendTail(i);
        }
        Operations operations = new Operations();
        operations.printList(h);
        h = operations.deleteNote(h, 4);
        operations.printList(h);
        h = operations.deleteNote(h, 1);
        operations.printList(h);
    }
}
