import java.util.stream.*;

class Solution {
    public String solution(String my_string, int m, int c) {
        StringBuilder sb = new StringBuilder();
        
        char[] cArray = my_string.toCharArray();
        for(int i = c - 1; i < cArray.length; i += m){
            sb.append(cArray[i]);
        }
        
        return sb.toString();                              
    }
}