import java.util.Arrays;

/**
 * Created by zzs on 2019/9/3 8:59
 */
public class Solution628 {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int ans1 = nums[0] * nums[1] * nums[n - 1];
        int ans2 = nums[n-1] * nums[n-2] * nums[n-3];
        return ans1 > ans2 ? ans1 : ans2;
    }
}
