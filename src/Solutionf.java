public class Solutionf {   //BF算法
    public int strStr(String haystack, String needle) {
        for (int i = 0; i < haystack.length() - needle.length(); i++) {
            int j = 0;
            int k = i;
            while (j < needle.length() && haystack.charAt(k) == needle.charAt(j)){
                k++;
                j++;
            }
            if (j == needle.length()){
                System.out.println(i);
                return i;
            }


        }
        System.out.println(-1);
        return -1;
    }

    public static void main(String[] args) {
        Solutionf solutionf = new Solutionf();
        solutionf.strStr("abcde","dc");
    }
}
