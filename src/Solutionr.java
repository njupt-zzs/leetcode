public class Solutionr {
    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        return toBST(nums, 0, nums.length - 1);
    }

    private TreeNode toBST(int[] nums, int left, int right) {  //实际上也是一个二分法，将中点左边的变成左子树，中点右边的变成右子树
        if(left > right) return null;
        int mid = (left + right) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = toBST(nums, left, mid - 1);   // 先根节点对应的左子树进行编排，在进行右子树编排。
        root.right = toBST(nums, mid + 1, right);
        return root;
    }
}
