public class Solution19 {
      private class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
  }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode first = dummy;
        ListNode second = dummy;
        for (int i = 0; i <= n; i++) {
            first = first.next;
        }

        while (first != null){
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return dummy.next;
        //如果不设置哑节点，万一删除的是头结点就会出问题 时间复杂度：遍历一遍链表 O（n） 空间复杂度：O（1）
    }
}
