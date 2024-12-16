import java.util.Arrays;

class Solution {
    public String[] solution(String myStr) {
        String[] result = Arrays.stream(myStr.split("a|b|c"))
            .filter(s -> !s.isEmpty())
            .toArray(String[]::new);
        if(result.length != 0){
            return result;
        }else{
            String[] empty = {"EMPTY"};
            return empty;
        }
    }
}