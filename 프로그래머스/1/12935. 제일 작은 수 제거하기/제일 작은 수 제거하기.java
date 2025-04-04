import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int length = arr.length;
        if (length == 1){
            return new int[] {-1};
        }
        
        int min = arr[0];
        
        for(int i : arr){
            if (min > i){
                min = i;
            }
        }
        
        int[] answer = new int[length - 1];
        int index = 0;
        
        for (int i = 0; i < length; i++){
            if (arr[i] == min){
                continue;
            }
            answer[index] = arr[i];
            index++;
        }
        return answer;
    }
}