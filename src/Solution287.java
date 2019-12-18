import java.util.HashSet;
import java.util.Set;

public class Solution287 {
    public int findDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return num;
            }
            seen.add(num);
        }

        return -1;
    }
}
//时间复杂度：O(n)  空间复杂度：最坏的情况是只有两个重复的元素，则seen要占据n-1个位置，O(n)
