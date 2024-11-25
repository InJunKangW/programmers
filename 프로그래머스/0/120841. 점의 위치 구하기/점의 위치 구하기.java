class Solution {
    public int solution(int[] dot) {
        int x = dot[0];
        int y = dot[1];
        boolean multiple = (x * y) > 0;
        int answer = multiple ? (x > 0 ? 1 : 3) : x > 0 ? 4 : 2;
        return answer;
    }
}