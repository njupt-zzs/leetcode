public class Solutionbe {
    public String gcdOfStrings(String str1, String str2) {
        if (str1 == null || str2 == null) {
            return "";
        }

        String longStr = str1.length() > str2.length() ? str1 : str2;
        String shortStr = str1.length() > str2.length() ? str2 : str1;


        while (longStr.length() != shortStr.length()) {
            if (longStr.indexOf(shortStr) == 0) {
                String tempStr = longStr.substring(shortStr.length(), longStr.length());
                longStr = tempStr.length() > shortStr.length() ? tempStr : shortStr;
                shortStr = tempStr.length() > shortStr.length() ? shortStr : tempStr;
            } else {
                return "";
            }
        }

        if (longStr.equals(shortStr)) {
            return longStr;
        }
        return "";
    }
}
