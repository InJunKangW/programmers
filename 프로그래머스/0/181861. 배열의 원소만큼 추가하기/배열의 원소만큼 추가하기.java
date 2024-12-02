import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr) {
        return IntStream.of(arr)
            .flatMap(i -> IntStream.generate(() -> i).limit(i))
            .toArray();
        }
}