import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String[] indicators = {"RT", "CF", "JM", "AN"};
        
        Map<Character, Integer> pointPerType = new HashMap<>();
        for(int i = 0; i < survey.length; i++){
            int point = choices[i] - 4;
            if (point != 0){
                Character type = survey[i].charAt(1);
                int nowPoint = pointPerType.getOrDefault(type, 0);
                pointPerType.put(type, nowPoint + point);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (String indicator : indicators) {
            char type1 = indicator.charAt(0);
            char type2 = indicator.charAt(1);
            
            int score1 = pointPerType.getOrDefault(type1, 0);
            int score2 = pointPerType.getOrDefault(type2, 0);

            sb.append(score1 >= score2 ? type1 : type2);
        }
        return sb.toString();
    }
}