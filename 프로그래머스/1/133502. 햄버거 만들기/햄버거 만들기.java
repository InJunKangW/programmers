import java.util.*;

class Solution {
    public int solution(int[] ingredients) {
        int answer = 0;
        Stack<Integer> burger = new Stack<>();
        for(int ingredient : ingredients){
            burger.push(ingredient);
            
            if(burger.size() >= 4
              && burger.peek() == 1
              && burger.get(burger.size() - 2) == 3
              && burger.get(burger.size() - 3) == 2
              && burger.get(burger.size() - 4) == 1){
                answer++;
                burger.pop();
                burger.pop();
                burger.pop();
                burger.pop();
            }
        }
        return answer;
    }
}