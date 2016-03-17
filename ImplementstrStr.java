/*Implement strStr().
 * Returns the index of the first occurrence of needle in haystack, 
 * or -1 if needle is not part of haystack.
 */
public class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0){
            return 0;
        } 
        for (int i = 0; i < haystack.length(); i ++){ 
            if (i + needle.length() > haystack.length()){
                return -1;
            }
            for (int j = 0; j < needle.length(); j ++){
                //compare haystack.charAt(i + j) and needle.charAt(j)
                if ( haystack.charAt(i + j) == needle.charAt(j) ){
                    if (j == (needle.length() -1)){
                        return i;
                    }
                }// if ==
                else{
                    break;
                }
             }//for j
        }//for i
        return -1;
        
    }
}