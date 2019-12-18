import java.util.ArrayList;
import java.util.List;

public class Solution22 {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        backtrack(ans, "", 0, 0, n);
        return ans;
    }

    private void backtrack(List<String> ans, String cur, int open, int close, int max){
        if (cur.length() == max * 2) {
            ans.add(cur);
            return;
        }                              //递归终止条件

        if (open < max)
            backtrack(ans, cur + "(", open + 1, close, max);  //   实际上返回的是第二个括号的入口
        if (close < open)
            backtrack(ans, cur + ")", open, close + 1, max);
    }
}
