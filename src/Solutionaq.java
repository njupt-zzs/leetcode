import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solutionaq {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; ++i) {
            if (set.contains(nums[i])) return true;
            set.add(nums[i]);
            if (set.size() > k) {
                set.remove(nums[i - k]);      //不是计数，是两数之差
            }
        }
        return false;

    }
}
