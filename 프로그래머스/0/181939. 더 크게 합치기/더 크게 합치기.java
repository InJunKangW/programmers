class Solution {
    public int solution(int a, int b) {
        String strA = String.valueOf(a);
        String strB = String.valueOf(b);
        return Math.max(Integer.parseInt(strA + strB), Integer.parseInt(strB + strA));
    }
}