class Solution {
    public boolean solution(String s) {
        int l = s.length();
        return (l == 4 || l == 6) && s.matches("\\d+");
    }
}