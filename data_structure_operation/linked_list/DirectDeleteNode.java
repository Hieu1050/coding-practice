public class DirectDeleteNode {
    public static void main(String[] args) {
        ListNode n1 = new ListNode (1);
        ListNode n2 = new ListNode (2);
        ListNode n3 = new ListNode (3);
        ListNode n4 = new ListNode (4);
        ListNode n5 = new ListNode (5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        printLinkedList(n1);
        deleteNode(n2);
        printLinkedList(n1);
    }
    public static void printLinkedList (ListNode node){
        ListNode curr = node;
        while (curr.next != null){
            System.out.printf ("%d -> ", curr.val);
            curr = curr.next;
        }
        System.out.println ();
    }

    public static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
