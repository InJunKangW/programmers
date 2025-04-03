class Solution {
    public String solution(String s) {
        int length = s.length();
        int middle = length / 2;
        
        return length % 2 == 0 ? s.substring(middle - 1, middle + 1) : s.substring(middle, middle + 1);
    }
}