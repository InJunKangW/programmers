class Solution {
    public int solution(int[][] board, int k) {
        int answer = 0;
        int x = Math.min(board.length - 1, k);
        
        for(int i = 0; i <= x; i++){
            for(int j = 0; j <= Math.min(board[0].length - 1, k - i); j++){
                answer += board[i][j];
            }
        }
        return answer;
    }
}