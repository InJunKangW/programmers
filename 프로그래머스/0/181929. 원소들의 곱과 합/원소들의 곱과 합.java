import java.util.stream.*;
import java.util.Arrays;

class Solution {
    public int solution(int[] num_list) {
        int multiplyAll = multiplyAll(num_list);
        int sumMultiply = sumMultiply(num_list);
        return multiplyAll > sumMultiply ? 0 : 1;
    }
    
    private int multiplyAll(int[] num_list){
        return Arrays.stream(num_list)
            .reduce(1, (a, b) -> a * b);
    }
    
    private int sumMultiply(int[] num_list){
        int sum = Arrays.stream(num_list)
            .sum();
        
        return sum * sum;
    }
}