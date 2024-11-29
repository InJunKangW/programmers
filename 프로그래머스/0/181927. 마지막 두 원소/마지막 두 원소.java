import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int size = num_list.length;
        int[] answer = new int[size + 1];
        System.arraycopy(num_list, 0, answer, 0, size);
        int a = num_list[size - 1];
        int b = num_list[size - 2];
        answer[size] = a > b ? a - b : 2 * a; 
        return answer;
    }
}