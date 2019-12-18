public class Solutionag {                    //暴力法求众数
    public int majorityElement(int[] nums) {
        int majorityCount = nums.length/2;

        for (int num : nums) {
            int count = 0;
            for (int elem : nums) {
                if (elem == num) {
                    count += 1;
                }
            }
            if (count > majorityCount) {      //在内遍历中每一次都进行判断
                return num;
            }

        }
        return -1;
    }
}
