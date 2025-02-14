import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = {};
        
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i : stages){
            map.merge(i, 1, Integer::sum);
        }
        
        List<Stage> stageList = new ArrayList<>();
        
        for(int i = 1; i <= N; i++){
            int stageNum = i;
            int failed = map.getOrDefault(i, 0);
            int total =  getTotal(i, map);
            
            Stage stage = new Stage(stageNum, failed, total);
            stageList.add(stage);
        }
        
        Collections.sort(stageList);
        
        
        return stageList.stream()
            .mapToInt(stage -> stage.getStage())
            .toArray();
        
        /*
        1 1
        2 3
        3 2
        4 1
        5 0
        6 1
        
        자기의 value / 자기보다 크거나 같은 value 총합
        1의 경우 1/ 7
        5의 경우 0 / 1
        2의 경우 3 / 7
        분모가 0이면 0.
        */
    }
    
    private int getTotal(int i, Map<Integer, Integer> map){
        return map.entrySet().stream()
             .filter(entry -> entry.getKey() >= i)
             .mapToInt(Map.Entry::getValue)
             .sum();
    }

    
    private class Stage implements Comparable<Stage>{
        public int stageNum;
        public int failed;
        public int total;
        
        
        public Stage(int stageNum, int failed, int total){
            this.stageNum = stageNum;
            this.failed = failed;
            this.total = total;
        }
        
        public int getStage(){
            return stageNum;
        }
        
        public double getPassPercent(){
            if (total == 0) {return 0;}
            return (double) failed / (double) total;
        }
        
        @Override
        public int compareTo(Stage other) {
            double thisPassPercent = this.getPassPercent();
            double otherPassPercent = other.getPassPercent();
              
            if (thisPassPercent == otherPassPercent){
                return this.stageNum - other.stageNum;
            }
            return Double.compare(other.getPassPercent(), this.getPassPercent()); 
        }
    }
}