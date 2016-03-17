/* Given numRows, generate the first numRows of Pascal's triangle.
 * For example, given numRows = 5,
 * Return
 *[
 *    [1],
 *   [1,1],
 *  [1,2,1],
 * [1,3,3,1],
 *[1,4,6,4,1]
 *]
 */

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
		List<Integer> list = new ArrayList<Integer>();
		if (numRows == 0)
			return res;
		list.add(1);
		res.add(list);
		while (--numRows > 0) {
			List<Integer> newlist = new ArrayList<Integer>();
			newlist.add(1);
			for (int i = 1; i < list.size(); i++) {
				newlist.add(list.get(i) + list.get(i - 1));
			}
			newlist.add(1);
			res.add(newlist);
			list = newlist;
		}
		return res;
        
    }
}