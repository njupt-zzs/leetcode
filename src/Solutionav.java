import java.util.HashSet;
import java.util.Set;

public class Solutionav {
    public int repeatedNTimes(int[] A) {
        Set<Integer> set = new HashSet<>();
        int a = 0;
        for (int i = 0; i < A.length; i++) {
            if (set.contains(A[i])){
                a = A[i];
                break;
            }


            else
                set.add(A[i]);
        }
        return a;
    }
}
