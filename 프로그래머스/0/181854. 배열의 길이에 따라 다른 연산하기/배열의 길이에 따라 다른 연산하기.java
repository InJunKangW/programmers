import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr, int n) {
        int a = arr.length % 2;
        return IntStream.range(0, arr.length)
            .map(i -> i % 2 == a ? arr[i] : arr[i] + n)
            .toArray();
            
    }
}