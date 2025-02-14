import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int aCount = 0, bCount = 0, cCount = 0;
        
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == a[i % a.length]) aCount++;
            if (answers[i] == b[i % b.length]) bCount++;
            if (answers[i] == c[i % c.length]) cCount++;
        }

        int max = Math.max(Math.max(aCount, bCount), cCount);
        
        List<Integer> result = new ArrayList<>();
        if (aCount == max) result.add(1);
        if (bCount == max) result.add(2);
        if (cCount == max) result.add(3);
        
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
