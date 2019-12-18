public class Solutiont {
    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public boolean isBalanced(TreeNode root) {
        return depth(root) != -1;
    }

    private int depth(TreeNode root) {   //递归是采用栈的原理
        if (root == null) return 0;      //这是递归的终止条件
        int left = depth(root.left);
        if(left == -1) return -1;   //这里的-1是结束哪个函数呢
        int right = depth(root.right);
        if(right == -1) return -1;
        return Math.abs(left - right) < 2 ? Math.max(left, right) + 1 : -1;   //递归返回值 ，向上一层返回，并不是向主函数返回
    }
}
