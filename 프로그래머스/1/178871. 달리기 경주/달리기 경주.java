import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.HashMap;import java.util.Map;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        
        HashMap<String, Integer> run = new HashMap<>();
        for(int i = 0; i < players.length; i++){
            run.put(players[i], i);
        }
        for(int i = 0; i < callings.length; i++){
            int th = run.get(callings[i]); //후발주자의 원래 등수.
            if(th>0){
                String temp = players[th-1]; 
                players[th-1] = players[th];
                players[th] = temp;
                run.put(players[th-1], th-1);
                run.put(players[th], th);
            }
            
        }
            
            
            
        
        
        return players;
    }
}