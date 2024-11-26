import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        Arrays.sort(num_list);
        int[] answer = new int[5];
        System.arraycopy(num_list, 0, answer, 0, 5);
        return answer;
    }
}