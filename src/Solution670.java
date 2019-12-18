import java.util.Arrays;

public class Solution670 {
    public int maximumSwap(int num) {
        //1.排序数组元素
        char[] orderNum = Integer.toString(num).toCharArray();
        char[] oldNum = Integer.toString(num).toCharArray();
        Arrays.sort(orderNum);                               //这里是从小到大排列

        int diff = -1;
        //2.比较第一个不同的元素
        for (int i = 0; i < orderNum.length; i++) {
            if (oldNum[i] != orderNum[orderNum.length - 1 - i]) {   //在原数组中，代交换的字符一个为diff
                diff = i;
                break;
            }
        }

        //两数相同，不需要交换
        if (diff == -1) return num;

        //两两交换
        for (int i = oldNum.length - 1; i >= diff; i--) {
            if (oldNum[i] == orderNum[orderNum.length - 1 - diff]) {   //这里面要找到第二个i
                //交换后直接跳出
                swap(oldNum, diff, i);
                break;
            }
        }

        return Integer.parseInt(new String(oldNum));
    }

    private void swap(char[] chars, int lo, int hi) {
        /*char tmp = chars[lo];
        chars[lo] = chars[hi];
        chars[hi] = tmp;*/

        chars[lo] ^= chars[hi];
        chars[hi] ^= chars[lo];   //在这里chars[hi]已经变成了char[lo]
        chars[lo] ^= chars[hi];
    }
}
