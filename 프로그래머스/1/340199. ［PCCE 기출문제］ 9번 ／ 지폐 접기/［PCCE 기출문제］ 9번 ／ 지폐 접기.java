class Solution {
   public boolean packable(int walletX, int walletY, int billX, int billY) {
        return
            (billX <= walletX && billY <= walletY)
            || (billX <= walletY && billY <= walletX);
    }

    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        int walletX = wallet[0];
        int walletY = wallet[1];
        
        int billX = bill[0];
        int billY = bill[1];
        
        while (!packable(walletX, walletY, billX, billY)) {
            answer++;
            if (billX > billY) {
                billX /= 2;
            } else {
                billY /= 2;
            }
        }
        
        return answer;
    }
}