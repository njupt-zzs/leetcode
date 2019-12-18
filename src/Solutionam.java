public class Solutionam {
    //回文链表
    //首先用双指针（快慢指针找到链表的中点）
    //利用双指针进行链表的翻转
    //最后循环进行比较
    private class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
  }
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        // 找到链表的中点
        ListNode mid = findMid(head);
        // 翻转中点后的链表
        mid = reverseList(mid);
        // 比较两段链表
        while (mid != null) {
            if (head.val != mid.val) {
                return false;
            }
            head = head.next;
            mid = mid.next;
        }
        return true;
    }

    private ListNode reverseList(ListNode head) {      //链表翻转
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

    // 找到链表的中间节点
    private ListNode findMid(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null) {      //这段很巧妙
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
