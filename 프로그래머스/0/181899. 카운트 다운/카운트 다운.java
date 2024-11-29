import java.util.stream.*;

class Solution {
    public int[] solution(int start_num, int end_num) {
        return IntStream.rangeClosed(end_num, start_num)
            .map(i -> end_num + start_num - i)
            .toArray();
    }
}