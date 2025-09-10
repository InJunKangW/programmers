class Solution {
    public String solution(String[] seoul) {
        int x = 0;
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                x = i;
                break;
            }
        }
        // 배열은 indexOf 매서드가 없어서 직접 찾아야 한다.
        
        return String.format("김서방은 %d에 있다", x);
    }
}