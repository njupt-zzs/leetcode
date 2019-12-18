public class Solution424 {
    public int characterReplacement(String s, int k) {
        if (s == null || s.length() == 0)
            return 0;
        int left = 0;
        int res = 0;
        int max = 0;
        char[] chs = new char[26];
        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            chs[ch - 'A']++;  //最右边的字符出现次数加一
            max = Math.max(max, chs[ch - 'A']);  //更新当前窗口内出现最多的字符次数
            while (right - left + 1 - max > k) {  //当前需要替换的字符数大于k,窗口左边收缩，直到窗口大小收缩到 max + k
                chs[s.charAt(left++) - 'A']--;  //这里只更新最右边的字符次数，不用更新 max
            }
            res = Math.max(res, right - left + 1);
        }
        return res;
    }

    public int characterReplacement2(String s, int k) {
        int max = 0, start = 0, end = 0, max_cur = 0;
        int[] count = new int[26];
        while (end < s.length()) {   //利用右指针遍历整个数组
            max_cur = Math.max(max_cur, ++count[s.charAt(end) - 'A']);   //窗口内最多的字符
            while (end - start + 1 - max_cur > k)
                count[s.charAt(start++) - 'A']--;
            max = Math.max(max, end - start + 1);
            end++;
        }
        return max;
    }
}



