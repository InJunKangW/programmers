import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        
        int answer = 0;
        
        for (int cost : d) {
            if (budget < cost) break;
            budget -= cost;
            answer++;
        }
        
        return answer;
    }
}