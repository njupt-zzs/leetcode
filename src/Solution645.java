public class Solution645 {
    public int[] findErrorNums(int[] nums) {

        int out[] = new int[2];

        //1。方法一：
        int count[] = new int[10002];
        for(int i = 0; i < nums.length; i++){
            count[nums[i]]++;

        }

        for(int i = 0; i <= nums.length; i++){   //不需要遍历count
            if(count[i] == 2)
                out[0] = i;
            if(count[i] == 0 && i != 0 )
                out[1] = i;
        }

        return out;

    }
}
