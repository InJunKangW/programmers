import java.util.*;

class Solution {
    public int solution(String[] s1, String[] s2) {
        Set<String> strSet = new HashSet<>(Arrays.asList(s1));
        int answer = 0;
        for(String str : s2){
            if(strSet.contains(str)) answer++;
        }
        return answer;
    }
}