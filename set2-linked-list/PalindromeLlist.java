import java.util.Arrays;
import java.util.Stack;

public class PalindromeLlist {
    public static void main(String[] args) {
        int [] lst = {1,2,2,1};
        NodeOperations o = new NodeOperations();
        Node n1 = o.generateFromArray(lst);
        o.printList(n1);
        isPalindrome(n1);
    }
    public static boolean isPalindrome(Node head) {
        Node p1 = head, p2 = head;
        Stack <Node> stack_first_half = new Stack<>();
        boolean is_even_length = true;
        // 1- adding half of the llist to stack
        while (p2 != null){
            stack_first_half.push(p1);
            if (p2.next == null){
                is_even_length = false;
                break;
            }
            p2 = p2.next;
            if (p2.next == null){
                is_even_length = true;
                break;
            }
            p2 = p2.next;
            p1 = p1.next;
        }
        // 2- if llist has odd number of nodes, discard the middle node
        if (!is_even_length){
            stack_first_half.pop();
        } 
        p1 = p1.next;
        // 3 -compare 2nd half with first half
        while (!stack_first_half.isEmpty()){
            System.out.println ("stack val:" + stack_first_half.peek().val);
            System.out.println ("node val: " + p1.val);
            if (p1.next != null) System.out.println (p1.next.val);
            if (p1.val != stack_first_half.pop().val) return false;
            p1 = p1.next;
        }   
        return true;
    }
}
