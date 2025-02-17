import java.util.*;


class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        Map<String, Set<String>> reportHistory = new HashMap<>();
        Map<String, Integer> reportedHistory = new HashMap<>();
        Set<String> banned = new HashSet<>();
        
        for(String s : report){
            String[] sArr = s.split(" ");
            String reporter = sArr[0];
            String reported = sArr[1];
            
            reportHistory.computeIfAbsent(reporter, key -> new HashSet<>()).add(reported);
        }
        
          for (Set<String> reports : reportHistory.values()) {
            for (String reported : reports) {
                reportedHistory.merge(reported, 1, Integer::sum);
            }
        }
        
        for (Map.Entry<String, Integer> entry : reportedHistory.entrySet()) {
            if (entry.getValue() >= k) {
                banned.add(entry.getKey());
            }
        }
        
        int[] answer = new int[id_list.length];
        for (int i = 0; i < id_list.length; i++){
            String reporter = id_list[i];
            Set<String> s = reportHistory.get(reporter);
            
            if (s != null){
                answer[i] = (int) s.stream()
                    .filter(banned::contains)
                    .count();
            }
        }
        return answer;
    }
}