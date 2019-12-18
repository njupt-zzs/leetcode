public class Solutionc {
    private class ListNode {  //定义一个节点，可以用一个首节点表示整条链！
      int val;
      ListNode next;
      ListNode(int x) { val = x; } //构造方法
  }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode prehead = new ListNode(-1);
        ListNode prev = prehead;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {  //这里并没有使用compareTo进行比较
                prev.next = l1;
                l1 = l1.next;
            } else {
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }
        prev.next = l1 == null ? l2 : l1;

        return prehead.next;
    }


}
