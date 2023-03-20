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
        System.out.println(removeElements(root, 6 ).print());
    }
    //use recursion to return different value
    public static ListNode removeElements(ListNode head, int val) {
        if(head == null ) return null;
        head.next = removeElements(head.next, val);
        return head.val == val ? head.next : head;
    }


}
