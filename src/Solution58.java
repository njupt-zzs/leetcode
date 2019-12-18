public class Solution58 {
        public int lengthOfLastWord(String s) {
            s = s.trim();
            int first = s.lastIndexOf(" ");
            if(first == -1)
                return s.length();
            String son = s.substring(first - 1, s.length());
            return son.length();
        }

    public static void main(String[] args) {
        String s = "";
        String a = " ";
        int  c =  ' ';
        int  j = '1';
        char c1 = 1 ;
        char c2 = '1';
        System.out.println(j);
        System.out.println(c1);
        System.out.println(c2);
    }


}
