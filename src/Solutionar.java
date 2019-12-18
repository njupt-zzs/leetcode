
public class Solutionar {
    public int longestPalindrome(String s) {
        int[] count = new int[128];
        for (char c : s.toCharArray())
            count[c]++;                //每个字符的个数存到count数组中去

        int ans = 0;
        for (int v : count) {          //这个循环是关键
            ans += v / 2 * 2;
            if (v % 2 == 1 && ans % 2 == 0)
                ans++;
        }
        return ans;
    }
}
