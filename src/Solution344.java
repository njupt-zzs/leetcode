public class Solution344 {
    public void reverseString(char[] s) {
        int i = 0, j = s.length - 1;
        while(i < j) {
            char tmp = s[i];
            s[i++] = s[j];
            s[j] = tmp;
            j--;      //异或出来是整数，不符合题意


        }
    }
}
