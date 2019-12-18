public class Solutionbg {
    public boolean checkRecord(String s) {   //遍历加计数器思想，简洁明了
        int absent=0;
        int late=0;
        for (int i=0;i<s.length();i++){
            if (s.charAt(i) == 'A'){
                late = 0;
                absent++;
                if (absent>1)
                    return false;
            }
            else if (s.charAt(i) == 'L'){
                late++;
                if (late>2)
                    return false;
            }
            else
                late = 0;
        }
        return true;
    }
}
