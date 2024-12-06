import java.util.*;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        List<Integer> numberList = new ArrayList<>();
        for(int n : numbers){
            numberList.add(n);
        }
        int d = direction.equals("left") ? -1 : 1;
        Collections.rotate(numberList, d);
        return numberList.stream().mapToInt(i -> i).toArray();
    }
}