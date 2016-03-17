/* Determine whether an integer is a palindrome. Do this without extra space.
 */
public class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
        	return false;
        }
        long result = 0;
        int original_x = x;
		while (x != 0) {
			result = result * 10 + x % 10;
			x /= 10;
			if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE)
				return false;
		}
		return (result == original_x);
        
    }
}
