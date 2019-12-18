import java.util.ArrayList;
import java.util.List;

public class Solution345 {
    public String reverseVowels(String s) {
        char[] letters = s.toCharArray();
        //使用快排的方法
        List<Character> list = new ArrayList<>();
        char[] letter=new char[] {'a','e','i','o','u','A','E','I','O','U'};   //元音字符存储在ArrayList中
        int len = s.length();  //字符串的长度
        for(int i=0;i<letter.length;i++)
            list.add(letter[i]);
        if (len > 1) {
            int i = 0;
            int j = len - 1;
            char temp;

            while (i < j) {
                while (j > i && !list.contains(letters[i]))
                    i++;
                while (j > i && !list.contains(letters[j]))
                    j--;
                if (i < j) {
                    temp = letters[j];
                    letters[j] = letters[i];
                    letters[i] = temp;
                    i++;
                    j--;
                }
            }
            s = String.valueOf(letters);
        }
        return s;
    }
}
