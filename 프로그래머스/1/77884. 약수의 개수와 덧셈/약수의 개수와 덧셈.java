class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for(int i = left; i <= right; i++){
            answer = Math.pow((int)Math.sqrt(i), 2) == i ? answer - i : answer + i;
        }
        
        return answer;
    }
}