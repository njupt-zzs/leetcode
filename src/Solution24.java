public class Solution24 {
     public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x; }
  }
    public ListNode swapPairs(ListNode head) {   //递归求解
        if(head == null || head.next == null){
            return head;
        }
        ListNode next = head.next;
        head.next = swapPairs(next.next);
        next.next = head;
        return next;
    }

    public ListNode swapPairs1(ListNode head) {  //迭代求解
        ListNode pre = new ListNode(0);   //pre是头节点
        pre.next = head;                    //head是表头节点
        ListNode temp = pre;
        while(temp.next != null && temp.next.next != null) {
            ListNode start = temp.next;
            ListNode end = temp.next.next;
            temp.next = end;
            start.next = end.next;
            end.next = start;
            temp = start;
        }
        return pre.next;
    }
}
