public class Solutionas {   //有问题，会进入一个死循环
    public boolean isHappy(int n) {
        int ans = 0;
        int x = 0;
         while (n < 10){
             x = n % 10;
             n /= 10;
             ans += x * x;
         }
         if (ans == 1)
             return true;
         else
             isHappy(ans);
         return false;
    }
}
