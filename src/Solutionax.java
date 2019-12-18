import java.util.HashSet;
import java.util.Set;

public class Solutionax {
    public int numJewelsInStones(String J, String S) {
        int val = 0;
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < J.length(); i++)
            set.add(J.charAt(i));
        for (int i = 0; i < S.length(); i++) {
            if (set.contains(S.charAt(i))){
                val++;
                continue;
            }

        }
        return val;
    }
}
