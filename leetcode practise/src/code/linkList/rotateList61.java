package code.linkList;

import basic.*;

public class rotateList61 {
    public static void main(String[] args) {
        int[] qu = { 1, 2, 6, 3, 4, 5, 6 };
        ListNode start = new ListNode(qu[0], null);
        ListNode root = start;
        for (int i = 1; i < qu.length; i++) {
            start.next = new ListNode(qu[i], null);
            start = start.next;
        }
        System.out.println(root.print());
        // System.out.println(rotateRight(root, 3).print());
        System.out.println(rotateRight1(root, 3).print());
    }

    // this is easiest one to roate
    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0)
            return head;
        for (int i = 0; i < k; i++) {
            ListNode cur = head;
            while (cur.next.next != null) {
                cur = cur.next;
            }
            ListNode first = cur.next;
            cur.next = null;
            first.next = head;
            head = first;
        }
        return head;
    }

    // this is easiest one to roate
    public static ListNode rotateRight1(ListNode head, int k) {
        if (k == 0 || head == null)
            return head;
        // get length of the link
        int count = 1;
        ListNode temp = head;
        while (temp.next != null) {
            count++;
            temp = temp.next;
        }
        // K greater than length
        if (k > count)
            k = k % count;
        if (k == count)
            return head;
        // get the head node
        k = count - k - 1;
        temp.next = head;
        temp = head;
        while (k > 0) {
            k--;
            temp = temp.next;
        }
        head = temp.next;
        temp.next = null;
        return head;
    }
}
