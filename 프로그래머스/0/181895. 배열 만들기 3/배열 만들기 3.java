import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] firstInterval = Arrays.copyOfRange(arr, intervals[0][0], intervals[0][1] + 1);
        // 두 번째 구간 추출
        int[] secondInterval = Arrays.copyOfRange(arr, intervals[1][0], intervals[1][1] + 1);
        
        // 두 배열 합치기
        int[] result = new int[firstInterval.length + secondInterval.length];
        System.arraycopy(firstInterval, 0, result, 0, firstInterval.length);
        System.arraycopy(secondInterval, 0, result, firstInterval.length, secondInterval.length);
        
        return result;
        // List<Integer> list = new ArrayList<>();
        // for(int i = 0; i <=1; i++){
        //     for(int j = intervals[i][0]; j <= intervals[i][1]; j++){
        //         list.add(arr[j]);
        //     }
        // }
        // return list.stream()
        //     .mapToInt(Integer::valueOf)
        //     .toArray();
    }
}