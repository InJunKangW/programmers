import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] sorted = emergency.clone();
        Arrays.sort(sorted);
        
        Map<Integer, Integer> rankMap = new HashMap<>();
        for (int i = 0; i < sorted.length; i++) {
            rankMap.put(sorted[i], sorted.length - i);
        }
        
        int[] answer = new int[emergency.length];
        for (int i = 0; i < emergency.length; i++) {
            answer[i] = rankMap.get(emergency[i]);
        }
        
        return answer;
    }
}