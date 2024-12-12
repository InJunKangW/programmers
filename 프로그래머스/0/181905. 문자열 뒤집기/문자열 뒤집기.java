class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuilder sb = new StringBuilder(my_string);
        String reversed = new StringBuilder(sb.substring(s, e + 1)).reverse().toString();
        sb.replace(s, e + 1, reversed);
        return sb.toString();
    }
}