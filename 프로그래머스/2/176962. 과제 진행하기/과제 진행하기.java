import java.util.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

class Solution {
    private class Project {
        private final String name;
        private final LocalTime startTime;
        private int timeLeft; // 남은 시간(분)
        
        public Project(String[] plan) {
            this.name = plan[0];
            this.startTime = LocalTime.parse(plan[1], DateTimeFormatter.ofPattern("HH:mm"));
            this.timeLeft = Integer.parseInt(plan[2]);
        }
        
        public String getName() {
            return name;
        }
        
        public LocalTime getStartTime() {
            return startTime;
        }
    }
    
    public String[] solution(String[][] plans) {
        // 1. 시작 시간 기준으로 정렬
        Arrays.sort(plans, (a, b) -> a[1].compareTo(b[1]));
        Stack<Project> stack = new Stack<>();
        List<String> answer = new ArrayList<>();
        
        for (int i = 0; i < plans.length; i++) {
            Project current = new Project(plans[i]);
            
            // 이전 과제와 비교
            if (!stack.isEmpty()) {
                Project prev = stack.pop();
                
                // 이전 과제 끝낼 수 있는 시간 계산
                long availableTime = java.time.Duration.between(prev.startTime, current.startTime).toMinutes();
                
                if (availableTime >= prev.timeLeft) {
                    // 이전 과제 끝낼 수 있음
                    answer.add(prev.name);
                    availableTime -= prev.timeLeft;
                    
                    // 남은 시간 있으면 스택에 있는 과제를 처리
                    while (!stack.isEmpty() && availableTime > 0) {
                        Project paused = stack.pop();
                        if (availableTime >= paused.timeLeft) {
                            answer.add(paused.name);
                            availableTime -= paused.timeLeft;
                        } else {
                            paused.timeLeft -= availableTime;
                            stack.push(paused);
                            availableTime = 0;
                        }
                    }
                    
                } else {
                    // 이전 과제 다 못 끝냄 -> 남은 시간만큼 줄이고 다시 스택에 저장
                    prev.timeLeft -= availableTime;
                    stack.push(prev);
                }
            }
            
            // 현재 과제 시작
            stack.push(current);
        }
        
        // 마지막까지 남은 과제 처리
        while (!stack.isEmpty()) {
            answer.add(stack.pop().name);
        }
        
        return answer.toArray(new String[0]);
    }
}
