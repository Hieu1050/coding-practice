import java.util.Stack;

// https://leetcode.com/problems/intersection-of-two-linked-lists/
public class Intersection2Llists {
    public Node getIntersectionNodeTwo (Node headA, Node headB){
        // 1- traversin' thru 2 llists to get the two llists' lengths
        Node pA = headA, pB = headB;
        int lA = 0, lB = 0;
        while (pA!= null){
            lA ++;
            pA = pA.next;
        }
        while (pB != null){
            lB ++;
            pB = pB.next;
        }
        // 2- from the head, move the pointer of the longer list to where the rest of that list is as long as the shorter list
        pA = headA; pB = headB;
        if (lA>= lB){
            for (int i = 0; i< (lA-lB); i ++){
                pA = pA.next;
            }
        }
        else {
            for (int i = 0; i< (lB-lA); i++){
                pB = pB.next;   
            }
        }
        // 3- traversin' thru the rest of 2 lists of the same length, return when 2 pointers are at the same node
        while (pA != null && pB != null){
            if (pA == pB) return pA;
            pA = pA.next; 
            pB = pB.next;
        }
        return null;
    }
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
        return last_shared_node;
    }
}
