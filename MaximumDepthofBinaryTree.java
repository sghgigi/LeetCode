/*Given a binary tree, find its maximum depth.The maximum depth is the number
 *of nodes along the longest path from the root node down to the farthest 
 *leaf node.
 *
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int maxDepth(TreeNode root) {
		return solve(root, 0);
	}

	public int solve(TreeNode node, int depth) {
		if (node == null)
			return depth;
		int left=solve(node.left,depth+1);
		int right=solve(node.right,depth+1);		
		return Math.max(left,right);
	}
}
