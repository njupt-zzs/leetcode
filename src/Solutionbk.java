public class Solutionbk {
    public class ListNode {
       int val;
       ListNode next;
       ListNode(int x) { val = x; }
  }
    public ListNode removeElements(ListNode head, int val) {
        ListNode root = head;
        if (root == null) return head;
        while (root != null && root.next != null){
            if (root.val == val){
                root.next.val = root.val;
                root.next = root.next.next;
                root = root.next;
            }
        }
        if (root != null && root.next == null && root.val == val)
            root = null;
    return head;
    }
}
