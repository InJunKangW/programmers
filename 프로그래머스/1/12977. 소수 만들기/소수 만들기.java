import java.util.*;

class Solution {
    public int solution(int[] nums) {
        List<Integer> list = new ArrayList<>();
        getPrimeNumberList(list, nums);
        
        return list.size();
    }
    
    private void getPrimeNumberList(List<Integer> list, int[] nums){
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if (isPrimeNumber(sum)){
                        list.add(sum);
                    }
                }
            }
        }
    }
    
    private boolean isPrimeNumber(int num) {
        if (num < 2) return false;
        int sqrt = (int) Math.sqrt(num);
        for (int i = 2; i <= sqrt; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}