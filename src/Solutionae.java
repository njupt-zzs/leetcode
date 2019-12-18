public class Solutionae {
    public int arrangeCoins(int n) {
        int k = 1;
        while (n > 0) {
            n -= k;
            k++;
        }
        if (n == 0) {
            return k - 1;
        } else {
            return k - 2;
        }
    }
}
