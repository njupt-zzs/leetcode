/**
 * Created by zzs on 2019/9/5 19:57
 */
public class Solution2001 {
    public static void main(String[] args) {
        String str = "817E";
        //String [] strings = new String[2];
        //strings[0] = str.substring(0,2);
        //strings[1] = str.substring(2,4);
        String result = "";
        String str1 = Integer.toBinaryString(Integer.valueOf(str.substring(0,2),16));
        String str2 = Integer.toBinaryString(Integer.valueOf(str.substring(2,4),16));
        if (str1.length() != 8){
            for (int i = str1.length(); i <8; i++) {
                str1 = "0" + str1;
            }
        }
        if (str2.length() != 8){
            for (int i = str2.length(); i <8; i++) {
                str2 = "0" + str2;
            }
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == str2.charAt(i))
                result += "0";
            else
                result += "1";
        }
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(result);
        System.out.println(Integer.toHexString(Integer.parseInt(result, 2)).toUpperCase());
    }
}
