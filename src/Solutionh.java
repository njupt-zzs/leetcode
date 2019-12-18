
public class Solutionh {
    public int maxSubArray(int[] nums) {
        int ans = nums[0];  //ans是结果
        int sum = 0;
        for(int num: nums) {
            if(sum > 0) {
                sum += num;
            } else {
                sum = num;   //sum是增益因子，大于零就可以
            }
            ans = Math.max(ans, sum);
        }
        System.out.println(ans);
        return ans;
    }

    public static void main(String[] args) {
        int [] a = {-1,1,-2,3,-1,2};
        Solutionh solutionh = new Solutionh();
        solutionh.maxSubArray(a);
    }
}
