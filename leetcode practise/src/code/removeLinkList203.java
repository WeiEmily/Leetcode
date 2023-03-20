package code;

import basic.ListNode;

public class removeLinkList203 {
    public static void main(String[] args) {
        int[] qu = {1, 2,6,3,4,5,6};
        ListNode start = new ListNode(qu[0], null);
        ListNode root = start;
        for (int i = 1; i < qu.length; i++) {
            start.next = new ListNode(qu[i], null);
            start = start.next;
        }
        System.out.println(root.print());
        //System.out.println(removeElements(root, 6 ).print());
        System.out.println(removeElements2(root, 6 ).print());
    }
    //use recursion to return different value
    public static ListNode removeElements(ListNode head, int val) {
        if(head == null ) return null;
        head.next = removeElements(head.next, val);
        return head.val == val ? head.next : head;
    }
    //without recursion
    public static ListNode removeElements2(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        ListNode dummy = new ListNode();
        dummy.next = head; //grasp the head to return
        ListNode cur = dummy; // for checking

        while (cur.next != null){
            if (cur.next.val == val){
                cur.next = cur.next.next;
                // Here cannot move cur to cur.next as we need to validate the next node.
            }else {
                cur = cur.next;
            }
        }
        return dummy.next;
    }

}
