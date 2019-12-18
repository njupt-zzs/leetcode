import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution216 {
    private List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> combinationSum3(int k, int n) {   //  k个数   n是目标和。
        traceBack(k, n, 0, 1, new LinkedList<>());
        return ans;
    }

    private void traceBack(int k, int n, int sum, int begin, LinkedList<Integer> list) {   //这是用链表存储，也可以用栈来存储
        if(k == 0) {   //如果递增，就还需要一个变量才能完成递归终止条件
            if(n == sum)
                ans.add(new ArrayList<>(list));
            return;
        }
        for(int i = begin; i < 10; i++) {   //你这玩的是加法
            list.add(i);
            traceBack(k - 1, n, sum + i ,i + 1, list);     //不能有重复的所以传递的是i+1
            list.removeLast();   //画图是关键
        }
    }
}
