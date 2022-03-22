public class Operations {
    public void printList (Node n){
        while (n != null){
            System.out.printf("%d -> ", n.val);
            n = n.next;
        }
        System.out.println ("null");
    }
}
