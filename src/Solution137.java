public class Solution137 {
    public int singleNumber(int[] nums) {
        int a = 0, b = 0;
        for (int num : nums)
        {
            a = (a ^ num) & ~b;
            b = (b ^ num) & ~a;
        }
        return a;
    }
}
