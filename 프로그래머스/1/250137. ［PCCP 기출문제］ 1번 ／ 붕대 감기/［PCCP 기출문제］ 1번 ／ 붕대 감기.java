import java.util.*;

class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int lastAttackTime = attacks[attacks.length-1][0];
        Map<Integer, Integer> attackInfo = new HashMap<>();
        for(int i = 0; i < attacks.length; i++){
            attackInfo.put(attacks[i][0], attacks[i][1]);
        }
        
        int maxHealth = health;
        int bandageTime = 0;
        int bandageMaxTime = bandage[0];
        int bandageHeal = bandage[1];
        int bandageAdditionalHeal = bandage[2];
        
        outerLoof:
        for(int i = 0; i <= lastAttackTime; i++){
            if(attackInfo.containsKey(i)){
                bandageTime = 0;
                health -= attackInfo.get(i);
                if(health <= 0){
                    health = -1;
                    break outerLoof;
                }
            }else{
                bandageTime++;
                health += bandageHeal;
                if(bandageTime == bandageMaxTime){
                    bandageTime = 0;
                    health += bandageAdditionalHeal;
                }
                if(health > maxHealth){
                    health = maxHealth;
                }
            }
        }
        return health;
    }
}