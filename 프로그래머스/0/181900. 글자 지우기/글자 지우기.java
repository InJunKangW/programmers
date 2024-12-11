import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        List<Integer> list = new ArrayList<>();
        for(int i : indices){
            list.add(i);
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < my_string.length(); i++){
            if(!list.contains(i)){
            sb.append(my_string.charAt(i));                
            }
        }
        return sb.toString();
    }
}