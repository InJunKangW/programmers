class Solution {
    public int[] solution(int[] num_list, int n) {
        int size = ((num_list.length - 1) / n ) + 1;
        int[] answer = new int[size];
        for(int i = 0; i < size; i++){
            answer[i] = num_list[i * n];
        }
        return answer;
    }
}