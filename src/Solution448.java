import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int len = nums.length;

        for (int i = 0; i < len; i++) {
            while (nums[i] != i + 1 && nums[nums[i] - 1] != nums[i]) {  //通过循环直到找到这个数最正确的位置
                swap(nums, i, nums[i] - 1);
            }
        }

        System.out.println("桶排序以后的数组：" + Arrays.toString(nums));
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                res.add(i + 1);
            }
        }
        System.out.println(res);
        return res;

    }

    private void swap(int[] nums, int i, int j) {  //不使用额外空间进行交换
        nums[i] = nums[i] ^ nums[j];
        nums[j] = nums[i] ^ nums[j];
        nums[i] = nums[i] ^ nums[j];
    }

    public static void main(String[] args) {
        int [] a = {3,4,3,1};
        Solution448 solution448 = new Solution448();
        solution448.findDisappearedNumbers(a);

    }

}
