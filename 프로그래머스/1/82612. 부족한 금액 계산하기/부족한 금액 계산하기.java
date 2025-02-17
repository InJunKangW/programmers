class Solution {
    public long solution(int price, int money, int count) {
        long totalCost = (long) price * count * (count + 1) / 2;
        
        return Math.max(totalCost - money, 0);
    }
}