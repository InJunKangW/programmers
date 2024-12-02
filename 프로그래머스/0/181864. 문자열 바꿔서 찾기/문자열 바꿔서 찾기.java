class Solution {
    public int solution(String myString, String pat) {
        return myString.replace("A", "temp").replace("B", "A").replace("temp", "B").contains(pat) ? 1 : 0;
    }
}