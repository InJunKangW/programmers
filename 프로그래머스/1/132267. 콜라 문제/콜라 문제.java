class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while(n / a > 0){
            int c = b * (n / a);
            answer += c;
            n = c + n % a;
        }
        return answer;
    }
}