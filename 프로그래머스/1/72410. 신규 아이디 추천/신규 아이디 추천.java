class Solution {
    public String solution(String new_id) {
        String answer = new_id.toLowerCase();
        answer = answer
            .replaceAll("[^a-z0-9\\-_\\.]", "")
            .replaceAll("\\.{2,}", ".")
            .replaceAll("^\\.|\\.$", "");
        
        if (answer.length() >= 16){
            answer = answer.substring(0, 15);
            answer = answer.replaceAll("^\\.|\\.$", "");
        }else if(answer.isBlank()){
            answer = "a";
        }
        if (answer.length() <= 2) {
            while (answer.length() < 3) {
                answer += answer.charAt(answer.length() - 1);
            }
        }
        
        return answer;
    }
}