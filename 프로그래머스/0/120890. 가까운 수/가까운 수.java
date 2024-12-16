class Solution {
    public int solution(int[] array, int n) {
        int answer = array[0];
        int minDiff = Math.abs(array[0] - n);
        
        for(int i = 0; i < array.length; i++){
            int diff = Math.abs(array[i] - n);
            if ((minDiff > diff) || (diff == minDiff && array[i] < answer)){
                minDiff = diff;
                answer = array[i];
            }
        }
        return answer;
    }
}