public class Solution485 {
    public int findMaxConsecutiveOnes(int[] nums) {  //一个计数器来计算当前1序列1的个数，一个max来保存1个数最大的值。
        int max = 0;
        int count = 0;
        for (int i : nums) {
            if (i == 1)
                count++;
            else
                count = 0;
            max = max > count ? max : count;
        }
        return max;
    }
}
