import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();
        getCombination(set, numbers, 0, 0, 0);
        
        return set.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
    
     private void getCombination(Set<Integer> set, int[] numbers, int count, int sum, int start) {
        if (count == 2) {
            set.add(sum);
            return;
        }

        for (int i = start; i < numbers.length; i++) {
            getCombination(set, numbers, count + 1, sum + numbers[i], i + 1);
        }
    }
}