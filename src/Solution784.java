import java.util.ArrayList;
import java.util.List;

public class Solution784 {
    public List<String> letterCasePermutation(String S) {
        List<String> ans = new ArrayList<>();
        dg(S.toCharArray(),0,ans);
        return ans;
    }


    private void dg(char[] s,int i,List<String> ans){
        if(i==s.length){
            ans.add(String.valueOf(s));
            return;
        }
        dg(s,i+1,ans);  //这里看不懂啊！！！ 先到头，再回头。
        if(s[i]<'0' || s[i]>'9'){   //这个条件是用来找字母,大于9表示为字母
            s[i] ^= (1<<5); //将1左移五位，实现大小写转换
            dg(s,i+1,ans);
        }

    }
}
