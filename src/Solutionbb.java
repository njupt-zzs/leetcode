public class Solutionbb {
    public boolean detectCapitalUse(String word) {    //是很简单，但就是想不到啊
        int c1 = 0, c2 = 0;
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) - 'a' >= 0){
                c1++;
            }else{
                c2++;
            }
        }
        if(c1 == word.length() || c2 == word.length()){
            return true;
        }
        return (1 == c2 && word.charAt(0) < 'a');
    }
}
