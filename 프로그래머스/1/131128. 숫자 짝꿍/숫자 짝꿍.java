import java.util.Arrays;
// import java.util.Collections;

class Solution {
    public String solution(String X, String Y) {
        char[] xChars = X.toCharArray();
        char[] yChars = Y.toCharArray();
        
        Arrays.sort(xChars);
        Arrays.sort(yChars);
        
        StringBuilder result = new StringBuilder();
        
        int i = 0, j = 0;
        while (i < xChars.length && j < yChars.length) {
            if (xChars[i] == yChars[j]) {
                result.append(xChars[i]);
                i++;
                j++;
            }
            else if (xChars[i] < yChars[j]) {
                i++;
            }
            else {
                j++;
            }
        }

        if (result.length() == 0) {
            return "-1";
        }
        
        if (result.toString().matches("0+")) {
            return "0";
        }
        
        return result.reverse().toString();
    }
}