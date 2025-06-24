import java.util.Arrays;

class Solution {
    public int solution(int[][] targets) {
        Arrays.sort(targets, (a, b) -> Integer.compare(a[1], b[1]));

        int count = 0;
        double lastInterceptX = -Double.MAX_VALUE;

        for (int[] target : targets) {
            int s = target[0];
            int e = target[1];

            if (!(s < lastInterceptX && lastInterceptX < e)) {
                count++;
                lastInterceptX = e - 0.5;
            }
        }

        return count;
    }
}