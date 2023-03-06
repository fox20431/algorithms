import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }
}

public class JZ32 {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> res = new ArrayList();
        if(root == null)
            //如果是空，则直接返回空数组
            return res;
        //队列存储，进行层次遍历
        Queue<TreeNode> q = new ArrayDeque<TreeNode>();
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode cur = q.poll();
            res.add(cur.val);
            //若是左右孩子存在，则存入左右孩子作为下一个层次
            if(cur.left != null)
                q.add(cur.left);
            if(cur.right != null)
                q.add(cur.right);
        }
        return res;
    }
}

class JZ32Main{
    public static void main(String[] args) {

    }
}

