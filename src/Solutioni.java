public class Solutioni {
    public int lengthOfLastWord(String s) {
        int val = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ')
                val++;
            else
                break;
        }
        System.out.println(val);
        return val;
    }

    public static void main(String[] args) {
        Solutioni solutioni = new Solutioni();
        solutioni.lengthOfLastWord("a");
    }
}
