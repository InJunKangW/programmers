class Solution {
    public String solution(String my_string, int num1, int num2) {
        char[] cArray = my_string.toCharArray();
        char temp = cArray[num1];
        cArray[num1] = cArray[num2];
        cArray[num2] = temp;
        return String.valueOf(cArray);
    }
}