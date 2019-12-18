public class Solution260 {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for(int num : nums)
            xor ^= num;

        int x = xor & (-xor);  //可以获得xor二进制位为一的最低位，负数的二进制位表示取反再加1
        int [] a = new int[2];
        for (int num : nums){
            if ((x & num) == 0)
                a[0] ^= num;
            else
                a[1] ^= num;
        }
        return a;
    }
}
