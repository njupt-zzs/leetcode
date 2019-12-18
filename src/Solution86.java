/**
 * Created by zzs on 2019/9/5 7:59
 */
public class Solution86 {
      private class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
  }
    public ListNode partition(ListNode head, int x) {
        ListNode before_head = new ListNode(0);
        ListNode before = before_head;
        ListNode after_head = new ListNode(0);
        ListNode after = after_head;

        while (head != null) {
            if (head.val < x) {
                before.next = head;  //在第一次的时候，就将before_head指向了头结点
                before = before.next;
            } else {
                after.next = head;
                after = after.next;
            }
            head = head.next;
        }
        after.next = null;
        before.next = after_head.next;
        return before_head.next;
    }

}
