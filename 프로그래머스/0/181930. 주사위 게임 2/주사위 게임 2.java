import java.util.*;

class Solution {
    public int solution(int a, int b, int c) {
        Set<Integer> set = new HashSet<>();
        set.add(a);
        set.add(b);
        set.add(c);
        
        int duplicate = 4 - set.size();
        
        int answer = pow(a, b, c, 1);
        
        for(int i = 2; i <= duplicate; i++){
            answer *= pow(a, b, c, i);
        }
        
        return answer;
    }
    
    private int pow(int a, int b, int c, int pow){
        return (int)(Math.pow(a, pow) + Math.pow(b, pow) + Math.pow(c, pow));
    }
}