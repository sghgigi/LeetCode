/* Given a pattern and a string str, find if str follows the same pattern.
 * Here follow means a full match, such that there is a bijection between a 
 * letter in pattern and a non-empty word in str.
 * Examples:
 * pattern = "abba", str = "dog cat cat dog" should return true.
 * pattern = "abba", str = "dog cat cat fish" should return false.
 * pattern = "aaaa", str = "dog cat cat dog" should return false.
 * pattern = "abba", str = "dog dog dog dog" should return false.
 */

public class Solution {
    public boolean wordPattern(String pattern, String str) {
        if (str == null || pattern == null)
			return false;
		if (pattern.length() == 0 && str.length() == 0)
			return true;
		HashMap<Character, String> map = new HashMap<Character, String>();
		String[] strs = str.split(" ");
		if (strs.length != pattern.length())
			return false;
		for (int i = 0; i < pattern.length(); i++) {
			if (map.containsKey(pattern.charAt(i))) {
				if (!map.get(pattern.charAt(i)).equals(strs[i]))
					return false;
			} else {
				if (map.containsValue(strs[i]))
					return false;
				map.put(pattern.charAt(i), strs[i]);
			}
		}
		return true;
        
    }
}