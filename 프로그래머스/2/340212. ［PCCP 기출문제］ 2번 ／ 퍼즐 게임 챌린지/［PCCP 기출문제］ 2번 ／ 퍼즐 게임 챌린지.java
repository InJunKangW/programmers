import java.util.*;

class Solution {
    public int solution(int[] diffs, int[] times, long limit) {
        int low = 1;
        int high = Arrays.stream(diffs).max().orElse(1);
        int result = high;
        
        while (low <= high) {
            int mid = (low + high) / 2;
            if (canCompleteWithinLimit(diffs, times, mid, limit)) {
                high = mid - 1;
                result = mid;
            } else {
                low = mid + 1;
            }
        }

        return result;
    }

    private boolean canCompleteWithinLimit(int[] diffs, int[] times, int level, long limit) {
        long totalTime = 0;

        for (int i = 0; i < diffs.length; i++) {
            int diff = diffs[i];
            int timeCur = times[i];
            int timePrev = i > 0 ? times[i - 1] : 0;

            if (diff <= level) {
                totalTime += timeCur;
            } else {
                int mistakes = diff - level;
                totalTime += (mistakes * (timeCur + timePrev)) + timeCur;
            }

            if (totalTime > limit) {
                return false;
            }
        }

        return totalTime <= limit;
    }
}
