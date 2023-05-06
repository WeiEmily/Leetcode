package code.linkList;

import basic.*;

public class MiddleNode876 {
    public static void main(String[] args) {
        int[] qu = { 1, 2, 6, 3, 4, 5, 6, 7, 8 };
        ListNode start = new ListNode(qu[0], null);
        ListNode root = start;
        for (int i = 1; i < qu.length; i++) {
            start.next = new ListNode(qu[i], null);
            start = start.next;
        }
        System.out.println(root.print());

        System.out.println("middle node is :" + middle(root).val);
    }

    // the method of find out the middle one
    public static ListNode middle(ListNode head) {
        // if the list is null the middle is null
        if (head == null)
            return null;
        // define the fast pointer
        ListNode fast = head;
        // define the slower pointer
        ListNode slow = head;
        // if fast is null or fast .next is null
        while (fast != null && fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
