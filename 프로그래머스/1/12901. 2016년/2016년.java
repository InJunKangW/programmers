import java.time.DayOfWeek;
import java.time.LocalDate;

class Solution {
    private final String[] days = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
    
    public String solution(int a, int b) {
        LocalDate date = LocalDate.of(2016, a, b);
        DayOfWeek day = date.getDayOfWeek();
        int dayNum = day.getValue() - 1;
        return days[dayNum];
    }
}