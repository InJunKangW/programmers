import java.util.*;

class Solution {
    int answer = Integer.MAX_VALUE;
    Map<String, Integer> memo = new HashMap<>();   
    
    public int solution(int[][] info, int n, int m) {
        dfs(info, 0, 0, 0, n, m);
        return answer == Integer.MAX_VALUE ? -1 : answer;
    }

    private void dfs(int[][] info, int index, int aPoint, int bPoint, int n, int m){
        if (aPoint >= n || bPoint >= m) return;
        
        if (info.length == index){
            answer = Math.min(aPoint, answer);
            return;
        }
        
         String key = index + "," + bPoint;
        if (memo.containsKey(key) && memo.get(key) <= aPoint) {
            return; // 이미 더 좋은 경로로 왔었다면 skip
        }
        memo.put(key, aPoint);
        
        dfs(info, index + 1, aPoint + info[index][0], bPoint, n, m);
        
        dfs(info, index + 1, aPoint, bPoint + info[index][1], n, m);
    }
}
