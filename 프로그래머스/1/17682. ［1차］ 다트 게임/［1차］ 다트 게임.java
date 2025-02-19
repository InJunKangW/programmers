import java.util.*;

class Solution {
    public int solution(String dartResult) {
        int[] scores = new int[3];
        int idx = -1;
        
        for (int i = 0; i < dartResult.length(); i++) {
            char c = dartResult.charAt(i);
            
            if (Character.isDigit(c)) {
                int num = Character.getNumericValue(c);
                
                if (num == 1 && i + 1 < dartResult.length() && dartResult.charAt(i + 1) == '0') {
                    num = 10;
                    i++;
                }

                idx++;
                scores[idx] = num;
            } 
            else if (c == 'S' || c == 'D' || c == 'T') {
                scores[idx] = (int) Math.pow(scores[idx], bonus(c));
            } 
            else if (c == '*' || c == '#') {
                if (c == '*') {
                    scores[idx] *= 2;
                    if (idx > 0) scores[idx - 1] *= 2;
                } else {
                    scores[idx] *= -1;
                }
            }
        }
        
        return scores[0] + scores[1] + scores[2];
    }

    private int bonus(char c) {
        switch (c) {
            case 'S': return 1;
            case 'D': return 2;
            case 'T': return 3;
            default: return 1;
        }
    }
}
