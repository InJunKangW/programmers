class Solution {
    boolean solution(String s) {
        String s1 = s.replace("p", "").replace("P", "");
        String s2 = s.replace("y", "").replace("Y", "");

        return s1.length() == s2.length();
    }
}