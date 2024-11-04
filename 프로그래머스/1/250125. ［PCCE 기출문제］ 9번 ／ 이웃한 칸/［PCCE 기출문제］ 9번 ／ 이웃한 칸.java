class Solution {
    public boolean isInBound(int height, int width, String [][] board){
        return 
            (width >= 0 && width < board[0].length
            && height >= 0 && height < board.length);
    }
    
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        int[] dx = {0, 0, 1, -1};
        int[] dy = {1, -1, 0, 0};
        
        String now = board[h][w];
        
        for(int i = 0; i < 4; i++){
            int height = h + dy[i];
            int width = w + dx[i];
             
            if(isInBound(height, width, board)){
                if(now.equals(board[height][width])){
                    answer++;
                }
            }
        }
        return answer;
    }
}