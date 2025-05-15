import java.util.*;

class Solution {
    public int solution(int n) {
        List<Integer> primeList = new ArrayList<>();
        primeList.add(2);
        
        for(int i = 3; i <= n; i++){
            boolean isPrime = true;
            
            for (int prime : primeList) {
                if (i % prime == 0) {
                    isPrime = false;
                    break;
                }
                
                if (prime * prime > i) break;
            }
            
            if (isPrime) {
                primeList.add(i);
            }
        }
        return primeList.size();
    }
}