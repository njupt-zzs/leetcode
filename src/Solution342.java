public class Solution342 {
    public boolean isPowerOfFour(int num) {
        //return ((num & 0x55555555) != 0) && ((num & (num - 1)) == 0);
        return (((num & (num - 1)) == 0 && (num & 0x55555555) != 0));
    }
}
