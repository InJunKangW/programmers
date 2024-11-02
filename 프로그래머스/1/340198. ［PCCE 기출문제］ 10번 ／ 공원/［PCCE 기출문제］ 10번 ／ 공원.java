import java.util.*;

class Solution {
    public int solution(int[] mats, String[][] park) {
        Arrays.sort(mats);
        int answer = -1;
        for(int i = mats.length - 1; i >= 0; i--){
            for(int j = 0; j < park.length; j++){
                for(int k = 0; k < park[0].length; k++){
                     if(matIsPlacable(mats[i], j, k, park)){
                         answer = mats[i];
                         return answer;
                     }
                }
            }
        }
        return answer;
    }
    
    public boolean matIsPlacable(int matSize,int startX, int startY, String[][] park){
        for(int i = startX; i < startX + matSize; i++){
            for (int j = startY; j < startY + matSize; j++){
                try{
                    if(!(park[i][j].equals("-1"))){
                        return false;
                    }
                }catch(ArrayIndexOutOfBoundsException e){
                    return false;
                }    
            }
        }
        return true;
    }
}