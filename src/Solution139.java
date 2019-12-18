import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by zzs on 2019/9/13 9:11
 */
public class Solution139 {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordDictSet=new HashSet<>(wordDict);
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordDictSet.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }

    public static void main(String[] args) {
        boolean [] dp = new boolean[10];
        for (boolean str : dp)
            System.out.println(str);
    }
}
