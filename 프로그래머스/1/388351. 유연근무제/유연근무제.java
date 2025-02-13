class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        int peopleCount = schedules.length;
        int totalDate = timelogs[0].length;
        
        for(int i = 0; i < peopleCount; i++){
            int time = schedules[i];
            int limitTime = getLimitTime(time);
            boolean hasNotBeenLate = true; 
                
            for(int j = 0; j < totalDate; j++){
                if (!isSaturday(j, startday) && !isSunday(j, startday)){
                    if (limitTime < timelogs[i][j]){
                        hasNotBeenLate = false;
                        break;
                    }
                }
            }
            if (hasNotBeenLate){
                answer++;
            }
        }
        return answer;
    }
    
    private boolean isSaturday(int index, int startday){
        return ((startday + index) % 7 == 6);
    }
    
    private boolean isSunday(int index, int startday){
        return ((startday + index) % 7 == 0);
    }
    
    private int getLimitTime(int schedule){
        int time = schedule + 10;
        if(time % 100 >= 60){
            time = time + 40;
        }
        return time;
    }
}