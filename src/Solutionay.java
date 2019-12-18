import java.util.HashMap;
import java.util.Map;

public class Solutionay {   //键和值要唯一对应
    public boolean isIsomorphic(String s, String t) {
        //利用HashMap 需保证： 键对应的值唯一 值对应的键唯一
        Map<Character,Character> map=new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            if(!map.containsKey(s.charAt(i))){               //如果map不包含遍历到的键
                if(map.containsValue(t.charAt(i)))
                    return false;                            //ab aa 不同键对应相同值得情况剔除掉 判断该值是否出现过即可 若出现过 则表明为 键不等 值相等的情况
                map.put(s.charAt(i),t.charAt(i));            //不包含的放进去了
            }else{
                if(map.get(s.charAt(i))!=t.charAt(i))
                    return false;                            //当键重复的时候判断该键对应的值是否与同位置上的值相等
            }
        }
        return true;
    }
}
