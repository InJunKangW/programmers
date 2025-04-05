class Solution {
    public long solution(long n) {
        long answer = 0;
        double a = Math.sqrt(n);
        
        if ((int) a - a != 0){
            return -1;
        }
        return (long) Math.pow(a + 1, 2);
    }
}