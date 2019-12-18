public class Solutionah {
    public int maxProfit(int prices[]) {
        //把第一个当做最小价格，两种方法，一是直接赋值，而是利用最大值。第一个数总是比最大值小。合并到一个程序里面去。
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i] < minprice)
                minprice = prices[i];
            else if (prices[i] - minprice > maxprofit)
                maxprofit = prices[i] - minprice;
        }
        return maxprofit;
    }
}
