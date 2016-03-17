    /* LintCode
     * For a given source string and a target string, you should output the
     * first index(from 0) of target string in source string.
     * If target does not exist in source, just return -1.
     */
public int strStr(String source, String target) {
        //write your code here
        if (source == null || target == null){
        return -1;
        }
        for (int i = 0; i < source.length() - target.length() +1; i++){
            int count = 0;
            for (int j = 0; j < target.length(); j++){
                if(source.charAt(i + j) != target.charAt(j)){
                    break;
                }
                count++;
            }
            if (count == target.length()){
                return i;
            }
        }
        return -1;
    }
