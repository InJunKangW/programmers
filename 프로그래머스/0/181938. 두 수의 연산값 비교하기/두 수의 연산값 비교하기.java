class Solution {
    public int solution(int a, int b) {
        int calcA = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        int calcB = 2 * a * b;
        return Math.max(calcA, calcB);
    }
}