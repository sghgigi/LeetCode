/*Given a sorted array, remove the duplicates in place such that each 
 * element appear only once and return the new length.
 * 
 * Do not allocate extra space for another array, you must do this in place 
 * with constant memory.
 * For example,
 * Given input array nums = [1,1,2],
 * Your function should return length = 2, with the first two elements of nums 
 * being 1 and 2 respectively. It doesn't matter what you leave beyond the 
 * new length.
 */

import java.util.*;

public class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (!set.contains(nums[i])) {
				set.add(nums[i]);
				nums[count++] = nums[i];
			}
		}
		return count;
        
    }
}