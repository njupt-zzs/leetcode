public class Solutiony {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        int j = k - 1;
        int max;
//         记录前k次的和
        for (int l = 0; l <= j; l++)
            sum += nums[l];
        max = sum;
        j++;
//         滑动窗口,每次的和减去上次的头加上本次的尾
        while (j < nums.length) {
            sum = sum - nums[j - k] + nums[j];
            if (sum > max) {
                max = sum;
            }
            j++;
        }
        return (double) max / k;
    }
}
