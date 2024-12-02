class Solution {
    public int solution(int[] num_list) {
        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();
        
        for(int i = 0; i < num_list.length; i++){
            int num = num_list[i];
            if(num % 2 == 0){
                a.append(num);
            }else{
                b.append(num);
            }
        }
        return Integer.parseInt(a.toString()) + Integer.parseInt(b.toString());
    }
}