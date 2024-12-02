import java.util.stream.*;
import java.util.Arrays;


class Solution {
    public String solution(String myString) {
        return myString.chars()
            .mapToObj(c -> (char)(c < 'l' ? 'l' : c))
            .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append) 
            .toString(); // Str
    }
}