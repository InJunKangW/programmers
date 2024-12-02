class Solution {
    public String solution(int[] numLog) {
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i < numLog.length; i++){
            int dif =numLog[i] - numLog[i - 1];
            if(dif == 1){
                sb.append("w");
            }else if(dif == -1){
                sb.append("s");
            }else if(dif == 10){
                sb.append("d");
            }else if(dif == -10){
                sb.append("a");
            }
        }
        return sb.toString();
    }
}