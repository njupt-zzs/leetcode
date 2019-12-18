import java.util.HashMap;
import java.util.Map;

public class Solution167 {
    public int[] twoSum(int[] numbers, int target) {  //常规解法  和Solution1一样  默认无序
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int complement = target - numbers[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i + 1};
            }
            map.put(numbers[i], i + 1);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public int[] twoSum1(int[] numbers, int target) {    //题目增强条件，可以采用双指针的方法进行解题
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[]{left + 1, right + 1};
            } else if (sum > target) {
                right--;
            } else {
                left++;
            }
        }
        throw new RuntimeException("在数组中没有找到这样的两个数，使得它们的和为指定值");
    }


}
