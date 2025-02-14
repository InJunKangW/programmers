class Solution {
    static int[][] pad = {{1,2,3}, {4,5,6}, {7,8,9}, {-1, 0, -2}};
    
    public String solution(int[] numbers, String hand) {
        StringBuilder answerBuilder = new StringBuilder();
        hand = hand.equals("right") ?  "R" : "L";
        int leftHand = -1;
        int rightHand = -2;
        
        for (int num : numbers){
            if (num == 0 || num % 3 == 2){
                String s = getWhichHandIsCloser(leftHand, rightHand, num, hand);
                if (s.equals("R")) {rightHand = num;}
                else{leftHand = num;}
                answerBuilder.append(s);
            }else if (num % 3 == 1){
                answerBuilder.append("L");
                leftHand = num;
            }else if (num % 3 == 0){
                answerBuilder.append("R");
                rightHand = num;
            }
        }
        return answerBuilder.toString();
    }
    
    private String getWhichHandIsCloser(int leftHand, int rightHand, int num, String hand){
        int distanceFromLeftHand = getDistance(leftHand, num);
        int distanceFromRightHand = getDistance(rightHand, num);
        
        if (distanceFromLeftHand == distanceFromRightHand){
            return hand;
        }
        
        return (distanceFromLeftHand > distanceFromRightHand) ? "R" : "L";
    }
    
    private int getDistance(int start, int end){
        int[] startIndex = new int[2];
        int[] endIndex = new int[2];
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 3; j++){
                if (pad[i][j] == start){
                    startIndex[0] = i;
                    startIndex[1] = j;
                }
                if (pad[i][j] == end){
                    endIndex[0] = i;
                    endIndex[1] = j;
                }
            }
        }

        return Math.abs(endIndex[0] - startIndex[0]) + Math.abs(endIndex[1] - startIndex[1]);        
    }
}