import java.util.stream.*;

class Solution {
    public String solution(String cipher, int code) {
        char[] cArray = cipher.toCharArray();
        return IntStream.rangeClosed(1, cipher.length() / code)
            .mapToObj(i -> String.valueOf(cArray[i * code - 1]))
            .collect(Collectors.joining());
    }
}