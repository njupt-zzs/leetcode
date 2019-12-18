public class Solutionac {
    //a*a + b*b = c  找到a和b使得等式相等
    //利用双指针
    public boolean judgeSquareSum(int c) {
        int a = (int) Math.sqrt(c);
        int b = a;
        int i = 0;
        while (i <= a){
            if (i * i + b * b == c)
                return true;
            else if (i * i + b * b > c)
                b--;
            else
                i++;
        }
        return false;
    }
}
