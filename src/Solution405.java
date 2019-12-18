public class Solution405 {
    public String toHex(int num) {
        if (num == 0)
            return "0";
        char[] chars = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
        StringBuilder sb = new StringBuilder();
        while (sb.length() < 8 && num != 0) {
            sb.append(chars[num & 0xf]);
            num >>= 4;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Solution405 solution405 = new Solution405();
        System.out.println(solution405.toHex(-3));
    }
}
