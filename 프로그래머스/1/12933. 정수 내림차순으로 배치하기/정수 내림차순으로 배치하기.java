class Solution {
    public long solution(long n) {
        char[] arr = String.valueOf(n).toCharArray();
        java.util.Arrays.sort(arr); // 오름차순 정렬
    
        StringBuilder sb = new StringBuilder(new String(arr));
        sb.reverse(); // 내림차순으로 만들기

        return Long.parseLong(sb.toString());
    }
}