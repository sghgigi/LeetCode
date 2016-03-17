/*Given a sorted integer array without duplicates, return the summary of 
 * its ranges.
 * For example, given [0,1,2,4,5,7], return ["0->2","4->5","7"].
 */

public class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new LinkedList<String>();
		if (nums == null)
			return null;
		if (nums.length == 0)
			return res;
		StringBuilder sb = new StringBuilder();
		sb.append(nums[0]);
		int p = 0;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != nums[i - 1] + 1) {
				if (i - p > 1) {
				    sb.append("->");
					sb.append(nums[i - 1]);
				}
				res.add(sb.toString());
				sb = new StringBuilder();
				sb.append(nums[i]);
				p = i;
			}
		}

		if (p < nums.length - 1){
		    sb.append("->");
		    sb.append(nums[nums.length - 1]);
		}
		res.add(sb.toString());
		return res;
        
        
    }
}