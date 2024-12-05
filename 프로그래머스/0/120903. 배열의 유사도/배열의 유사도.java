import java.util.*;

class Solution {
    public int solution(String[] s1, String[] s2) {
        Set<String> strSet1 = new HashSet<>(Arrays.asList(s1));
        Set<String> strSet2 = new HashSet<>(Arrays.asList(s2));
        strSet1.retainAll(strSet2);
        return (strSet1.size());
    }
}