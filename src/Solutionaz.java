import java.util.HashSet;
import java.util.Set;

public class Solutionaz {
    public int distributeCandies(int[] candies) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < candies.length; i++) {
            if (!set.contains(candies[i]))
                set.add(candies[i]);
        }
        return set.size() >= candies.length / 2 ? candies.length / 2 : set.size();
    }
}
