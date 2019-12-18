

public class Solution148 {
      private class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
 }

    public ListNode sortList(ListNode head) {   //要掌握归并排序的模板
        if (head == null || head.next == null) {
            return head;
        }

        ListNode mid = findMiddle(head);
        ListNode right = sortList(mid.next);
        mid.next = null;

        ListNode left = sortList(head);

        return merge(left, right);
    }


    private ListNode findMiddle(ListNode node) {  //快慢指针寻找中点
        ListNode fast = node.next;
        ListNode slow = node;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }

    private ListNode merge(ListNode left, ListNode right) {
        ListNode a = left;
        ListNode b = right;

        ListNode result = new ListNode(0);
        ListNode tmp = result;

        while (a != null && b != null) {
            while (a != null && a.val <= b.val) {
                tmp.next = new ListNode(a.val);
                tmp = tmp.next;
                a = a.next;
            }

            while (a != null && b != null && b.val <= a.val) {
                tmp.next = new ListNode(b.val);
                tmp = tmp.next;
                b = b.next;
            }
        }

        if (a != null) {
            tmp.next = a;
        } else if (b != null) {
            tmp.next = b;
        }

        return result.next;
    }


    public ListNode sortList1(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode fast = head.next, slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode tmp = slow.next;
        slow.next = null;
        ListNode left = sortList1(head);
        ListNode right = sortList1(tmp);
        ListNode h = new ListNode(0);           //辅助的头结点
        ListNode res = h;
        while (left != null && right != null) {
            if (left.val < right.val) {
                h.next = left;
                left = left.next;
            } else {
                h.next = right;
                right = right.next;
            }
            h = h.next;
        }
        h.next = left != null ? left : right;     //添加还没有加进来的
        return res.next;
    }


 }


