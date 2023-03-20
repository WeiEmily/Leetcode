package basic;

public class ListNode {
    public int val;
      public ListNode next;
      public ListNode() {}
    public ListNode(int val) { this.val = val; }
      public ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public String print(){
          StringBuilder ans = new StringBuilder();
          ListNode newNode = this;
          while(newNode != null){
              ans.append(newNode.val);
              newNode = newNode.next;
              ans.append("->");
          }
      return ans.toString();
    }
}
