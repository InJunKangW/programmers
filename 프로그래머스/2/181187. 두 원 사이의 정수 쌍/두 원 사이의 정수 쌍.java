class Solution {
    public long solution(int r1, int r2) {
        long answer = 0;

        for (int x = 1; x <= r2; x++) {
            long r2MaxY = (long) Math.floor(Math.sqrt((long) r2 * r2 - (long) x * x));
            long r1MinY = 0;
            if (x < r1) {
                r1MinY = (long) Math.ceil(Math.sqrt((long) r1 * r1 - (long) x * x));
            }

            answer += r2MaxY - r1MinY + 1;
        }

        return answer * 4;
    }
}