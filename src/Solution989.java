import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution989 {
    public List<Integer> addToArrayForm(int[] A, int K) {
        int N = A.length;
        int cur = K;
        List<Integer> ans = new ArrayList<>();   //可以自动调节大小

        int i = N;
        while (--i >= 0 || cur > 0) {
            if (i >= 0)
                cur += A[i];
            ans.add(cur % 10);   //这些都是十进制
            cur /= 10;
        }

        Collections.reverse(ans);
        return ans;
    }
}
