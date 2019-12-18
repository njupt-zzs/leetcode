public class Solutionbd {
    public int countSegments(String s) {
        int count = 0;
        boolean lastIsBlank = true;           //标志位
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                lastIsBlank = true;
            } else {
                if (lastIsBlank) {
                    count++;
                }
                lastIsBlank = false;
            }
        }
        return count;
    }
}
