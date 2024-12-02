import java.util.stream.*;
import java.util.Arrays;

class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        return IntStream.range(0, my_strings.length)
            .mapToObj(i -> my_strings[i].substring(parts[i][0], parts[i][1] +1 ))
            .collect(Collectors.joining());
    }
}