class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i = 0; i < n; i++){
            int a1 = arr1[i];
            int a2 = arr2[i];
            
            String binary = Integer.toBinaryString(a1 | a2);
         
            binary = String.format("%" + n + "s", binary);

            answer[i] = binary.replace('1', '#').replace('0', ' ');
        }
        return answer;
    }
}