public class AddTwoNumbers {
    static ListNode Solution (ListNode l1, ListNode l2) {
        ListNode res = new ListNode();
        ListNode node = res;
        int carry = 0;
        while (true){
            if (l1 == null && l2 == null){
                if (carry == 1 ) {
                    node.next = new ListNode();
                    node = node.next;
                    node.val = 1;
                }
                break;
            }
            node.next = new ListNode();
            node = node.next;
            if (l1 == null){
                node.val = (carry + l2.val) % 10;
                carry = (carry + l2.val)/10;
                l2 = l2.next;
            }
            else if (l2 == null){
                
                node.val = (carry + l1.val) % 10;
                carry = (carry + l1.val)/10;
                l1 = l1.next;
            }
            else {
                
                node.val = (carry + l1.val + l2.val) %10;
                carry = (carry + l1.val + l2.val)/10;
                l2= l2.next;
                l1= l1.next;
            }
        }
        return res.next;
    }
}
