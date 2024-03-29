public class Solutionbl {
    private class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
   }
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null){
            ListNode nextTemp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = nextTemp;
        }
        return pre;
    }
}
