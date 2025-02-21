import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int length = nums.length;
        
        Set<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        
        return (int)Math.min(set.size(), length / 2);
    }
}