import java.util.stream.*;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int k) {
        boolean isEven = k % 2 == 0;
        return Arrays.stream(arr)
            .map(i -> isEven? i + k : i * k)
            .toArray();
    }
}