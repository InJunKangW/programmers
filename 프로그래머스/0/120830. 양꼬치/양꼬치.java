class Solution {
    public int solution(int n, int k) {
        int service = n / 10;
        int answer = 0;
        
        answer += (Math.max(k - service, 0) * 2000) + 12000 * n;
        return answer;
    }
}