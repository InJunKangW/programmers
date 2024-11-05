import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        PriorityQueue<Integer> hallOfFame = new PriorityQueue<>();

        for (int i = 0; i < score.length; i++) {
            hallOfFame.add(score[i]);

            if (hallOfFame.size() > k) {
                hallOfFame.poll();
            }
            
            answer[i] = hallOfFame.peek();
        }
        
        return answer;
    }
}