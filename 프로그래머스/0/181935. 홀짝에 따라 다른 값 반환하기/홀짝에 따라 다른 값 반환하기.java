import java.util.stream.*;

class Solution {
    public int solution(int n) {
        boolean odd = n % 2 == 0;
        return odd ?
            IntStream.rangeClosed(1, n / 2)
                .map(i -> 4 * i * i)
                .sum()
            :IntStream.rangeClosed(1, n / 2 + 1)
                .map(i -> 2 * i - 1)
                .sum(); 
    }
}