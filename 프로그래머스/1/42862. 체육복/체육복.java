import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        List<Integer> lostList = new ArrayList<>();
        for(int i : lost){
            lostList.add(i);
        }
        
        List<Integer> reserveList = new ArrayList<>();
        for(int i : reserve){
            reserveList.add(i);
        }
        
        List<Integer> both = new ArrayList<>(lostList);
        both.retainAll(reserveList);

        lostList.removeAll(both);
        reserveList.removeAll(both);
        
        Collections.sort(reserveList);
        
        reserveList.removeIf(i -> {
            int previous = i - 1;
            int next = i + 1;

            if (lostList.contains(previous)) {
                lostList.remove(Integer.valueOf(previous));
                return true;
            } else if (lostList.contains(next)) {
                lostList.remove(Integer.valueOf(next));
                return true;
            }
            return false;
        });
        
        return n - lostList.size();
    }
}