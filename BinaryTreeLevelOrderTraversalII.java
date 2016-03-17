/*Given a binary tree, return the bottom-up level order traversal of 
 *its nodes' values. (ie, from left to right, level by level from leaf to root).
**For example:
**Given binary tree {3,9,20,#,#,15,7},
**    3
**   / \
**  9  20
**    /  \
**   15   7
**return its bottom-up level order traversal as:
**[
** [15,7],
**  [9,20],
**  [3]
**]
*
* Definition for a binary tree node.
* public class TreeNode {
*     int val;
*     TreeNode left;
*     TreeNode right;
*     TreeNode(int x) { val = x; }
* }
*/
import java.util.ArrayList;

public class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
		List<List<Integer>> res_reverse = new ArrayList<List<Integer>>();
		if (root == null)
			return res;
		List<TreeNode> layer = new ArrayList<TreeNode>();
		layer.add(root);
		while (true) {
			if (layer.isEmpty())
				break;
			List<TreeNode> nextlayer = new ArrayList<TreeNode>();
			List<Integer> currlayer = new ArrayList<Integer>();
			for (TreeNode node : layer) {
				currlayer.add(node.val);
				if (node.left != null) {
					nextlayer.add(node.left);
				}
				if (node.right != null) {
					nextlayer.add(node.right);
				}
			}
			res.add(currlayer);
			layer = nextlayer;
		}
		for (int i = res.size() - 1; i >= 0; i--) {
			res_reverse.add(res.get(i));
		}
		return res_reverse;
        
    }
}
