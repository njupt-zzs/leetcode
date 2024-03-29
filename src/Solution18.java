import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution18 {
    private static ArrayList<List<Integer>> kSum(int nums[], int target, int k, int start){
        ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();
        if(start>=nums.length)
            return res;
        if(k == 2){
            int l = start, h = nums.length-1;
            while(l < h){
                if(nums[l] + nums[h] == target){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[l]);
                    list.add(nums[h]);
                    res.add(list);
                    while(l < h && nums[l] == nums[l+1])
                        l++;
                    while(l < h && nums[h] == nums[h-1])
                        h--;
                    l++;
                    h--;
                }else if(nums[l] + nums[h] < target)
                    l++;
                else
                    h--;
            }
            return res;
        }
        if(k > 2){
            for(int i = start;i < nums.length-k+1;i++){
                ArrayList<List<Integer>> temp = kSum(nums, target - nums[i], k - 1, i + 1);   //真的很巧妙
                if(temp!=null) {
                    for (List<Integer> l : temp) {
                        l.add(0, nums[i]);
                    }
                    res.addAll(temp);
                }
                while(i < nums.length - 1 && nums[i] == nums[i+1]){
                    i++;
                }
            }
            return res;
        }
        return res;
    }

    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        return kSum(nums, target, 4, 0);
    }

}
