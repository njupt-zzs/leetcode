public class Solutionk {
    int s;  //设置成全局变量

    public int mySqrt(int x) {
        s = x;
        if(x == 0) return 0;
        System.out.println((int)(sqrts(x)));
        return ((int)(sqrts(x)));

    }

    public double sqrts(double x){
        double res = (x + s / x) / 2;
        if (res == x) {      //这里等号这里有误差估计的  ，也是一个判断条件。
            return x;
        } else {
            return sqrts(res);
        }
    }

    public static void main(String[] args) {
        Solutionk solutionk = new Solutionk();
        solutionk.mySqrt(4);
    }
}
