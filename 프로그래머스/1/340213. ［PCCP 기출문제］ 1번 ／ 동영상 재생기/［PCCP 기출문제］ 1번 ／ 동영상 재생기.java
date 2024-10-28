import java.util.*;

class Solution {
    public int getSecond (String time){
        String[] fullTime = time.split(":");
        int minute = Integer.parseInt(fullTime[0]);
        int second = Integer.parseInt(fullTime[1]);
        return (minute * 60) + second;
    }
    
    public boolean isOpening(int startTime, int endTime, int posTime){
        return (startTime <= posTime && posTime < endTime);
    }
    
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands){
        int startTime = getSecond(op_start);
        int endTime = getSecond(op_end);
        int posTime = getSecond(pos);
        int videoTime = getSecond(video_len);
        
       
        if(isOpening(startTime, endTime, posTime)){
            posTime = endTime;
        }
        
        for(String command : commands){
            if(command.equals("prev")){
                posTime -= 10;
                if(posTime < 0){
                    posTime = 0;
                }
            }else if(command.equals("next")){
                posTime += 10;
                if(posTime > videoTime){
                    posTime = videoTime;
                }
            }
            if(isOpening(startTime, endTime, posTime)){
                posTime = endTime;
            }
        }
        
        int minutes = posTime / 60;
        int seconds = posTime % 60;
        return String.format("%02d:%02d", minutes, seconds);
    }
}