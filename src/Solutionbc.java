public class Solutionbc {
    public boolean repeatedSubstringPattern(String s) {  //花里胡哨，没啥用。到时候拼的还是基本功。
        int len=s.length(),i=0,t=0;
        for(t=1;t<=len/2;++t)
        {
            if (len%t != 0) continue;// 有余数,一定不为周期串
            for (i=t;i<len && s.charAt(i%t) == s.charAt(i);++i);
            if (i==len) return true;
        }
        return false;

    }
}
