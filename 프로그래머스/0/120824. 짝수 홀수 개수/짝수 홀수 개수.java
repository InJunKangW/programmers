class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int a = 0;
        for(int num : num_list){
            a = num % 2;
            answer[a]++;
        }
        return answer;
    }
}