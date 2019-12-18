import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution350 {
    public int[] intersect(int[] nums1, int[] nums2) {   //这也是双指针的解法
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> list = new ArrayList<>();   //这是一个动态数组，可以控制知道数组的容量
        for (int i = 0, j = 0; i < nums1.length && j < nums2.length;)
        {
            if (nums1[i] > nums2[j]) j++;
            else if (nums1[i] < nums2[j]) i++;
            else
            {
                list.add(nums1[i]);
                i++;j++;
            }
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++)
            res[i] = list.get(i);
        return res;
    }
}
