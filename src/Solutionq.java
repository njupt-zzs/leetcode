import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solutionq {
    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public List<List<Integer>>levelOrderBottom(TreeNode root){
        List<List<Integer>>res=new ArrayList<>();
        helper(root,0,res);
        Collections.reverse(res);  //这是个静态的方法
        return res;
    }
    public void helper(TreeNode root,int depth,List<List<Integer>>res){
        if(root==null)
            return;
        if(depth+1>res.size())
            res.add(new ArrayList());
        res.get(depth).add(root.val);
        if(root.left!=null)helper(root.left,depth+1,res);
        if(root.right!=null)helper(root.right,depth+1,res);
    }

}
