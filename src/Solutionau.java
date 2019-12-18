public class Solutionau {                               //添加的值是相同的怎么办  ，我这种方法就是不成立的了
    public char findTheDifference(String s, String t) {   //如果是特异的，就是一个其他的都是成双的，如果是重复的，就是三个也还是奇数。
        int res = 0;
        for (char c : s.toCharArray()) {
            res ^= c;
        }
        for (char c : t.toCharArray()) {
            res ^= c;
        }
        return (char) res;

    }
}
