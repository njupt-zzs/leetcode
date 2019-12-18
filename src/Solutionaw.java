import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
   //题目：错误的集合
public class Solutionaw {   //总体来讲就是个错误的答案，傻逼到家
    public int[] findErrorNums(int[] nums) {
        int [] a = new int[2];
        Arrays.sort(nums);
        Set<Integer> set = new HashSet<>();
        set.add(nums[nums.length-1]);
        int b = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (set.contains(nums[i])){
                a[0] = nums[i];
                b = i;
                break;
            }
            else
                set.add(nums[i]);
        }
        if (nums[b+1] - nums[b] == 2)   //这肯定是等于0的啊
            a[1] = nums[b] + 1;
        else if (nums[b+1] - nums[b] == 1)
            a[1] = nums[b] - 1;
        else if (nums[b+1] - nums[b] == 0)
            a[1] = nums[b] + 1;

        return a;
    }
}
