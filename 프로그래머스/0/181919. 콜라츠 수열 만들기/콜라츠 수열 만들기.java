import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> intList = new ArrayList<>();
        while(n != 1){
            intList.add(n);
            n = n % 2 == 0? n / 2 :3 * n + 1;
        }
        intList.add(1);
        return intList.stream().mapToInt(i -> i).toArray();
    }
}