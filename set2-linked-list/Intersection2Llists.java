import java.util.Stack;

// https://leetcode.com/problems/intersection-of-two-linked-lists/
public class Intersection2Llists {
    public Node getIntersectionNode(Node headA, Node headB) {
        // 1- traversin' thru 2 llists while pushin' visited nodes to two stacks
        Node pA = headA, pB = headB;
        Stack <Node> sA = new Stack<>(), sB = new Stack<>();
        while (pA!= null){
            sA.push (pA);
            pA = pA.next;
        }
        while (pB != null){
            sB.push (pB);
            pB = pB.next;
        }
        // 2- if the top nodes of 2 stacks are not the same RETURN null
        if (sB.peek() != sA.peek()) return null;
        Node last_shared_node = sA.pop(); sB.pop();
        // 3- while BOTH stack are not empty 
        while (!sA.isEmpty() && !sB.isEmpty()){
            if (sB.peek() != sA.peek()) return last_shared_node;
            last_shared_node = sA.pop(); sB.pop();
        }
        
}
