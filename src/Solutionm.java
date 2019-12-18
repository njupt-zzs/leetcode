public class Solutionm {
    private class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode deleteDuplicates(ListNode head) {   //不需要双指针的
        ListNode current = head;
        while (current != null && current.next != null){
            if (current.val == current.next.val)
                current.next = current.next.next;  //删节点，节点没有动
            else
                current = current.next;  //移动节点
        }
        return head;
    }
}
