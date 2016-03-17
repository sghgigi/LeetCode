/*Given an integer array nums, find the sum of the elements between indices 
 * i and j (i �� j), inclusive.
 *Example:
 *Given nums = [-2, 0, 3, -5, 2, -1]
 *sumRange(0, 2) -> 1
 *sumRange(2, 5) -> -1
 *sumRange(0, 5) -> -3
 *Note:
 *You may assume that the array does not change.
 *There are many calls to sumRange function.
 */

public class NumArray {
    int[] prefixSum;
    public NumArray(int[] nums) {
        int length = nums.length;
			prefixSum = new int[length + 1];

			prefixSum[0] = 0;
			for (int i = 0; i < length; i++) {
				prefixSum[i + 1] = prefixSum[i] + nums[i];
			}
    }

    public int sumRange(int i, int j) {
			return prefixSum[j + 1] - prefixSum[i];
		}
}