class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int n = arr.length;
        int[] diff = new int[n + 1];

        for (int[] query : queries) {
            int s = query[0];
            int e = query[1];
            diff[s] += 1;
            if (e + 1 < n) diff[e + 1] -= 1;
        }

        int runningSum = 0;
        for (int i = 0; i < n; i++) {
            runningSum += diff[i];
            arr[i] += runningSum;
        }

        return arr;
    }
}