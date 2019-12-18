public class Solutionab {
    public boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length-1; j++) {
                if (nums[i] == nums[j])
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int [] a = {1,2,3,1};
        Solutionab solutionab = new Solutionab();
        solutionab.containsDuplicate(a);
    }
}
