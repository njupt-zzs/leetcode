import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Solution349 {
    public int[] intersection(int[] nums1, int[] nums2){
        HashSet<Integer> set1 = new HashSet<Integer>();
        for (Integer n : nums1) set1.add(n);
        HashSet<Integer> set2 = new HashSet<Integer>();
        for (Integer n : nums2) set2.add(n);

        set1.retainAll(set2);     //取交集的意思

        int [] output = new int[set1.size()];
        int idx = 0;
        for (int s : set1) output[idx++] = s;
        return output;

    }


    public int[] intersection1(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> list = new ArrayList<>();   //这是一个动态数组，可以控制知道数组的容量
        int value = Integer.MIN_VALUE;
        for (int i = 0, j = 0; i < nums1.length && j < nums2.length;)
        {
            if (nums1[i] > nums2[j]) j++;
            else if (nums1[i] < nums2[j]) i++;
            else
            {
                if (nums1[i] != value)        //去除重复的元素
                {
                    value = nums1[i];
                    list.add(nums1[i]);
                }
                i++;j++;
            }
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++)
            res[i] = list.get(i);
        return res;
    }
}
