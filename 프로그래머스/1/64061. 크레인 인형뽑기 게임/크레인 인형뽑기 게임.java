import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        Stack<Integer> dollStack = new Stack<>();
        for (int move : moves){
            int doll = findDoll(board, move);
            
            if (doll != -1){
                if(!dollStack.isEmpty()){
                    if (dollStack.peek().equals(doll)){
                        answer += 2;
                        dollStack.pop();
                    }else{
                        dollStack.push(doll);
                    }
                }else{
                    dollStack.push(doll);
                }
            }
        }
        return answer;
    }
    
    private int findDoll(int[][] board, int move){
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board[0].length; j++){
                if (j == move - 1 && board[i][j] != 0){
                    int result = board[i][j];
                    board[i][j] = 0;
                    return result;
                }
            }
        }
        return -1;
    }
}