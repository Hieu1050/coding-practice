import org.w3c.dom.NodeList;

public class ReverseLinkedList {
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
