/* Given two strings s and t, write a function to determine if t is an anagram 
 * of s.
 * For example,
 * s = "anagram", t = "nagaram", return true.
 * s = "rat", t = "car", return false.
 * Note:
 * You may assume the string contains only lowercase alphabets.
 */

public class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length()!= t.length())
        return false;
        char[] a = new char[s.length()];
        char[] b = new char[t.length()];
        for(int i = 0; i < s.length();i++)
        {
            a[i] = s.charAt(i);
            b[i] = t.charAt(i);
        }
        for(int i = 0; i < s.length();i++)
        {
            for(int j = 0; j < s.length();j++)
            {
                if(a[i] == b[j])
                {
                    b[j] = '-';
                    break;
                }
            }
        }
        for(int i = 0; i < s.length();i++)
        {
            if (b[i] != '-')
            return false;
        }
        return true;
        
    }
}