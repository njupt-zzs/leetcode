public class Solution762 {
    public  int countPrimeSetBits(int L, int R) {
        int sum = 0;
        while(L <= R) {
            int count = 0;
            while (L != 0){
                count++;
                L &= L - 1;
            }
            L++;
            if(isPrime(count))
                sum++;
        }
        return sum;

    }
    private static boolean isPrime(int count) {
        if(count == 2 || count == 3 || count == 5 || count==7 || count==11 || count==13 || count==17 || count==19)
            return true;
        return false;
    }

    public static void main(String[] args) {
        Solution762 solution762 = new Solution762();

        System.out.println(solution762.countPrimeSetBits(6,10));
    }
}
