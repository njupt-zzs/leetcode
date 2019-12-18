public class Solution860 {
    public boolean lemonadeChange(int[] bills) {
        int five = 0, ten = 0;    //相当于计数器
        for (int bill: bills) {   //在遍历里卖做文章，也很简单
            if (bill == 5)
                five++;
            else if (bill == 10) {
                if (five == 0) return false;
                five--;
                ten++;
            } else {
                if (five > 0 && ten > 0) {
                    five--;
                    ten--;
                } else if (five >= 3) {
                    five -= 3;
                } else {
                    return false;
                }
            }
        }

        return true;
    }
}
