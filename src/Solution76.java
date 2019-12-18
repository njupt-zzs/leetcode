import java.util.HashMap;
import java.util.Map;

/**
 * Created by zzs on 2019/9/10 9:42
 */
public class Solution76 {
    public String minWindow(String s, String t) {
        if (s.length() == 0 || t.length() == 0) {
            return "";
        }
        Map<Character, Integer> dictT = new HashMap<>();  //计算t字符串中字符的出现的次数
        for (int i = 0; i < t.length(); i++) {
            int count = dictT.getOrDefault(t.charAt(i), 0);  //自动装箱
            dictT.put(t.charAt(i), count + 1);
        }
        int required = dictT.size();
        int l = 0, r = 0;            //左右指针
        int formed = 0;
        Map<Character, Integer> windowCounts = new HashMap<Character, Integer>();
        int[] ans = {-1, 0, 0};   //它要输出字符串，必须要下标
        while (r < s.length()) {
            char c = s.charAt(r);
            int count = windowCounts.getOrDefault(c, 0);
            windowCounts.put(c, count + 1);
            if (dictT.containsKey(c) && windowCounts.get(c).intValue() == dictT.get(c).intValue()) {
                formed++;
            }
            while (l <= r && formed == required) {     //只有先达到右指针的条件，才会进入左指针的循环当中
                c = s.charAt(l);
                if (ans[0] == -1 || r - l + 1 < ans[0]) {
                    ans[0] = r - l + 1;
                    ans[1] = l;
                    ans[2] = r;
                }
                windowCounts.put(c, windowCounts.get(c) - 1);
                if (dictT.containsKey(c) && windowCounts.get(c).intValue() < dictT.get(c).intValue()) {
                    formed--;
                }
                l++;
            }
            r++;
        }
        return ans[0] == -1 ? "" : s.substring(ans[1], ans[2] + 1);      //左闭右开区间
    }
}