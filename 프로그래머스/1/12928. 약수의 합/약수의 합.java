class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for (int a = 1; a * a <= n; a++) {
            if (n % a == 0) {
                answer += a;
                if (a != n / a) {
                    answer += n / a;
                }
            }
        }
        return answer;
    }
}