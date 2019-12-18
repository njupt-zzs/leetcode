public class Solutionbv {
    public String toLowerCase(String str) {
        StringBuffer ans = new StringBuffer();
        for(int i = 0;i < str.length();i++)
        {
            char a = str.charAt(i);
            a = tolowercase(a);
            ans.append(a);
        }
        return ans.toString();
    }
    private char tolowercase(char t)
    {
        if(t >= 'A' && t <= 'Z')
        {
            t = (char) (t+32);
        }
        return t;

    }
}
