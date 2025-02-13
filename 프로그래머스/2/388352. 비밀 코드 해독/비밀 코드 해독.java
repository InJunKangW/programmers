import java.util.*;

class Solution {
    public int solution(int n, int[][] q, int[] ans) {
        int answer = 0;
        List<int[]> allCombinations = generateCombinations(n, 5);

         for (int[] candidate : allCombinations) {
            if (isValidSecretCode(candidate, q, ans)) {
                answer++;
            }
        }
        return answer;
    }
    
    private List<int[]> generateCombinations(int n, int k) {
        List<int[]> combinations = new ArrayList<>();
        int[] combination = new int[k];
        combineHelper(combinations, combination, 0, 1, n, k);
        return combinations;
    }
    
    private void combineHelper(List<int[]> combinations, int[] combination, int index, int start, int n, int k) {
        if (index == k) {
            combinations.add(combination.clone());
            return;
        }
        for (int i = start; i <= n; i++) {
            combination[index] = i;
            combineHelper(combinations, combination, index + 1, i + 1, n, k);
        }
    }
    
    private boolean isValidSecretCode(int[] candidate, int[][] q, int[] ans) {
        for (int i = 0; i < q.length; i++) {
            if (countMatches(candidate, q[i]) != ans[i]) {
                return false;
            }
        }
        return true;
    }
    
     private int countMatches(int[] a, int[] b) {
        Set<Integer> set = new HashSet<>();
        for (int num : a) {
            set.add(num);
        }
        int count = 0;
        for (int num : b) {
            if (set.contains(num)) count++;
        }
        return count;
     }
}