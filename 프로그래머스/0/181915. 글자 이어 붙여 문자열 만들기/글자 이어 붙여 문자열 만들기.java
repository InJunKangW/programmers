import java.util.stream.*;

class Solution {
    public String solution(String my_string, int[] index_list) {
        return IntStream.of(index_list)
            .mapToObj(i -> String.valueOf(my_string.charAt(i)))
            .collect(Collectors.joining());
    }
}