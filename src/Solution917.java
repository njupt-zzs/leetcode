public class Solution917 {
    public String reverseOnlyLetters(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }
        int l = 0;  //左指针
        int r = s.length() - 1;  //右指针
        char[] arr = s.toCharArray();
        while (l < r) {
            char lc = arr[l];
            if (lc < 'A' || (lc > 'Z' && lc < 'a') || lc > 'z') {
                l++;
                continue;
            }
            char rc = arr[r];
            if (rc < 'A' || (rc > 'Z' && rc < 'a') || rc > 'z') {
                r--;
                continue;
            }
            arr[l++] = rc;
            arr[r--] = lc;
        }
        return new String(arr);
    }
}
