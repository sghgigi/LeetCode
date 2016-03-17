/*Given a binary tree, return all root-to-leaf paths.
**
**For example, given the following binary tree:
**
**   1
** /   \
**2     3
** \
**  5
**All root-to-leaf paths are:
**
**["1->2->5", "1->3"]
**
* Definition for a binary tree node.
* public class TreeNode {
*     int val;
*     TreeNode left;
*     TreeNode right;
*     TreeNode(int x) { val = x; }
* }
*/
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ret = new ArrayList<String>();

    if(root == null){
        return ret;
    }

    dfs(root, new StringBuilder(), ret);

    return ret;
        
    }
    
    public void dfs(TreeNode root, StringBuilder sb, List<String> ret){

        if(root.left == null && root.right == null){
            sb.append(root.val);
            ret.add(sb.toString());
            return;
        }

        sb.append(root.val);
        sb.append("->");

        if(root.left != null){
            dfs(root.left, new StringBuilder(sb), ret);
        }

        if(root.right != null){
            dfs(root.right, new StringBuilder(sb), ret);
        }
    }
}
