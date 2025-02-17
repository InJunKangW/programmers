class Solution {
    public int solution(int[][] sizes) {
        int maxW = 0;
        int maxH = 0;

        for (int[] size : sizes) {
            int w = Math.max(size[0], size[1]); // 가로와 세로 중 더 긴 값을 가로로 설정
            int h = Math.min(size[0], size[1]); // 더 짧은 값을 세로로 설정
            
            maxW = Math.max(maxW, w); // 가장 긴 가로 길이 갱신
            maxH = Math.max(maxH, h); // 가장 긴 세로 길이 갱신
        }

        return maxW * maxH; // 최적 지갑 크기 계산
    }
}