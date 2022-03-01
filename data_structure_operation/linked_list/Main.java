
public class Main {
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
        printLinkedList (n1);
        printLinkedList(ReverseLinkedList.reverseListNode (n1));
    }
    
    public static void printLinkedList (ListNode node){
        if  (node != null){
            System.out.printf("%d", node.val ); 
            if (node.next != null){
                System.out.printf("->");
                printLinkedList(node.next);
            }
            else {System.out.println ();}
        }
    }
    public static ListNode reverseListNode (ListNode head){
        ListNode prev_node = null;
        while (head != null){
            ListNode next_node = head.next;
            head.next = prev_node;
            prev_node = head;
            head = next_node;
        }
        return prev_node;
    }
}
