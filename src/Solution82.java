/**
 * Created by zzs on 2019/9/10 8:43
 */
public class Solution82 {
     private class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
  }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy.next;
        while (fast != null) {
            while (fast.next != null && fast.val == fast.next.val)
                fast = fast.next;
            if (slow.next == fast)
                slow = slow.next;
            else
                slow.next = fast.next;  //只有一句有效
            fast = fast.next;
        }
        return dummy.next;
    }
}
