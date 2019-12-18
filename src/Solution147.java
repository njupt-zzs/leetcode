public class Solution147 {
    private class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

    public ListNode insertionSortList(ListNode head) {
        if(head==null || head.next==null)return head;
        ListNode p = head;
        ListNode q = head.next;
        ListNode fake = new ListNode(-1);
        fake.next = head;
        while(q != null){
            int temp = q.val;
            if(p.val < temp){       //如果上一位已经比它小了，表示已经排好顺序了，不用排
                q = q.next;
                p = p.next;
            }else{                  //拿出q从头开始比较
                p.next = q.next;   //直接先将p连到后面
                ListNode f = fake;
                while(f.next.val < q.val){
                    f=f.next;//肯定会碰到那个比他大的，不然就不会进入这里了
                }
                q.next = f.next;
                f.next = q;     //插入
                q = p.next;     //插完之后又放到p后面
            }
        }
        return fake.next;
    }

}
