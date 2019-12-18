import java.util.ArrayList;
import java.util.List;

public class Solution78 {
    public List<List<Integer>> subsets(int[] nums) {  //回溯法
        List<List<Integer>> res = new ArrayList<>();
        backtrack(0, nums, res, new ArrayList<Integer>());  //方法中的匿名内部类
        return res;

    }

    private void backtrack(int i, int[] nums, List<List<Integer>> res, ArrayList<Integer> tmp) {
        res.add(new ArrayList<>(tmp));  //空集
        for (int j = i; j < nums.length; j++) {
            tmp.add(nums[j]);
            backtrack(j + 1, nums, res, tmp);
            tmp.remove(tmp.size() - 1);
        }
    }

    private List<List<Integer>> subsets1(int[] nums) {  //利用位运算
        List<List<Integer>> list = new ArrayList<List<Integer>>();

        int size = nums.length;
        for (int i = 0; i < (1 << size); i++) {          //i表示二进制数
            List<Integer> ax = new ArrayList<>();
            for (int j = 0; j < size; j++) {             //就是寻找i中1的位置
                if ((i & (1 << j)) != 0) {
                    ax.add(nums[j]);
                }
            }
            list.add(ax);
        }

        return list;
    }

    private List<List<Integer>> subsets2(int[] nums) {    //采用迭代的方法
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());//初始化空数组
        for(int i = 0;i<nums.length;i++){   //外层循环
            List<List<Integer>> ans_tmp = new ArrayList<>();
            //遍历之前的所有结果
            for(List<Integer> list : ans){
                List<Integer> tmp = new ArrayList<>(list);
                tmp.add(nums[i]);    //加入新增数字
                ans_tmp.add(tmp);
            }
            ans.addAll(ans_tmp);
        }
        return ans;
    }
}
