public class Solution26 {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;   //我没有考虑数组容量为零的情况
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];        //你这也太巧妙了吧，利用双指针
            }
        }
        return i + 1;
    }
}
