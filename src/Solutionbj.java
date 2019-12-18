public class Solutionbj {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
    public void deleteNode(ListNode node) {   //这两行代码真是天秀
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
