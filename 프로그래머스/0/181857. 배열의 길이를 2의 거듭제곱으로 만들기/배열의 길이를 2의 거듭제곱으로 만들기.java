class Solution {
    public int[] solution(int[] arr) {
        int length = arr.length;
        int newLength = 1;
        
        while(newLength < length){
            newLength <<= 1;
        }
        int[] answer = new int[newLength];
        
        System.arraycopy(arr, 0, answer, 0, length);
        return answer;
    }
}