public class Solution445 {
    private class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
  }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //翻转之后再进行想加
       return reverse(addTwoNumbers1(reverse(l1),reverse(l2)));

    }

    private ListNode reverse(ListNode head){
        ListNode pre = null;   //它已经等于空了，何来的pre.next呢
        ListNode curr = head;
        while (curr != null){
            ListNode nextTemp = curr.next;
            curr.next = pre;
            pre = curr;
            curr = nextTemp;
        }
        return pre;
    }

    private ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);      //虚拟节点
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);    //第一次表示表头节点
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }

}
