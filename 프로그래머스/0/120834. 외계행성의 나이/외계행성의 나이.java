class Solution {
    public String solution(int age) {
        char[] cArray = String.valueOf(age).toCharArray();
        
        for (int i = 0; i < cArray.length; i++) {
            cArray[i] += 49; 
        }
        return String.valueOf(cArray);
    }
}