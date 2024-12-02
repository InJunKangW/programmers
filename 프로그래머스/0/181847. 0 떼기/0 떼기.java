class Solution {
    public String solution(String n_str) {
        char[] cArray = n_str.toCharArray();
        int index = 0;
        while(cArray[index] == '0'){
            index++;
        }
        return n_str.substring(index);
    }
}