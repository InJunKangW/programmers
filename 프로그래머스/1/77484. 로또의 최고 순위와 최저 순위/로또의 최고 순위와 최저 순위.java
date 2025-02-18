class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int match = 0;
        int zero = 0;
        
        for (int i : lottos){
            if(i == 0){
                zero ++;
                continue;
            }
            
            for(int j : win_nums){
                if (i == j){
                    match++;
                    break;
                }
            }   
        }

        int max = match + zero == 0 ? 6 : 7 - match - zero;
        int min = match == 0 ? 6 : 7 - match;
        int[] answer = {max, min};
        return answer;
    }
}