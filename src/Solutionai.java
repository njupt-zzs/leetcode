public class Solutionai {
    private int [] sum;
    public Solutionai(int[] nums) {
        //在构造方法里面求出每一项sum的和
        sum = new int[nums.length+1];
        for (int i = 0; i < nums.length; i++) {
            sum[i+1] = sum[i] + nums[i];
        }
    }
    public int sumRange(int i, int j) {
        return sum[j+1] - sum[i];
    }
}
