import java.util.stream.*;
import java.util.Arrays;
import java.util.Set;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        Set<Integer> deleteSet = Arrays.stream(delete_list).boxed().collect(Collectors.toSet());
        
        return Arrays.stream(arr)
           .filter(i -> !deleteSet.contains(i))
           .toArray();
    }
}