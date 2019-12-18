public class Solution80 {
        public int removeDuplicates(int[] nums) {
            int i = 0;
            for (int n : nums)
                if (i < 2 || n != nums[i-2])
                    nums[i++] = n;               //压根就不需要判断
            return i;
        }

    public int removeDuplicates1(int[] nums) {
        int m = 0;
        for (int i = 0; i < nums.length;) {
            if (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                int val = nums[i];
                nums[m++] = nums[i++];
                nums[m++] = nums[i++];
                while (i < nums.length && nums[i] == val)
                    i++;
            } else
                nums[m++] = nums[i++];
        }
        return m;
    }


}
