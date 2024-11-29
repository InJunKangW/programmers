import java.util.stream.*;

class Solution {
    public int[] solution(int n, int k) {
        return IntStream.rangeClosed(1, n / k)
            .map(i -> k * i)
            .toArray();
    }
}