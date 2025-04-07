class Solution {
    public String solution(String s, int n) {
        StringBuilder result = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c == ' ') {
                result.append(' ');
            } else if (c >= 'A' && c <= 'Z') {
                char shifted = (char) ((c - 'A' + n) % 26 + 'A');
                result.append(shifted);
            } else if (c >= 'a' && c <= 'z') {
                char shifted = (char) ((c - 'a' + n) % 26 + 'a');
                result.append(shifted);
            }
        }

        return result.toString();
    }
}