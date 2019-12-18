import java.util.ArrayList;
import java.util.List;

/**
 * Created by zzs on 2019/9/12 8:26
 */
public class Solution151 {
        public String reverseWords(String s) {
        List<String> list = new ArrayList<>();
            for(String str : s.trim().split("\\s+")) {
                list.add(0, str);
            }
        return String.join(" ", list);
    }

    public static void main(String[] args) {
        Solution151 solution151 = new Solution151();
        System.out.println(solution151.reverseWords("I love my mother!"));
    }

}
