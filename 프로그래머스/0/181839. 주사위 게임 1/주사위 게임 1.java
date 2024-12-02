class Solution {
    public int solution(int a, int b) {
        int c = a % 2 + b % 2;
        if(c == 0){
            return Math.abs(a - b);
        }else if(c == 1){
            return 2 * (a + b);
        }else if(c == 2){
            return a * a + b * b;
        }
        return 0;
    }
}