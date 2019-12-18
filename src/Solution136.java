public class Solution136 {
    public int singleNumber(int[] nums){
        if (nums.length == 0) return -1;
        int ans = nums[0];
        for (int i = 1; i < nums.length; i++) {
            ans ^= nums[i];
        }
        return ans;
    }
}
