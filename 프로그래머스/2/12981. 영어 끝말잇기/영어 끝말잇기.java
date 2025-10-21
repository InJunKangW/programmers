import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int length = words.length;
        int index = 0;
        
        Set<String> w = new HashSet<>();
        char firstAlphabet = ' ';
        
        while(index < length){
            String word = words[index];
            char c = word.charAt(0);
            
            if(w.contains(word) || (index > 0 && c != firstAlphabet)){
                break;
            }else{
                w.add(words[index]);
                index++;
                firstAlphabet = word.charAt(word.length() - 1);
            }
        }
        
        int[] answer = new int[2];
        
        if(index == length){
            return answer;
        }
        
        answer[0] = (index % n) + 1;
        answer[1] = (index / n) + 1;       
        return answer;
    }
}