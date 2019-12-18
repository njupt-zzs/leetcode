public class Solution476 {
    public int findComplement(int num) {

        int num0 = 1;

        while(num0 <= num)
            num0 = num0 << 1;

        num0 -= 1;

        return (int)num0 ^ num;
    }
}
