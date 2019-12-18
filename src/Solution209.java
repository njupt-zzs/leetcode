/**
 * Created by zzs on 2019/9/2 8:18
 */
public class Solution209 {
    public int minSubArrayLen(int s, int[] nums) {
        int n = nums.length;
        int left = 0;
        int sum = 0;
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            while (sum >= s){
                ans = Math.min(ans , i - left + 1);
                sum -= nums[left++];
            }
        }
        return ans != Integer.MAX_VALUE ? ans : 0;
    }
}
