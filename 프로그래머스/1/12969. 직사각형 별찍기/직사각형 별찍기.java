import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        String star = "*";
        String text = star.repeat(a);
        
        int count = 0;
        
        while(count < b){   
            System.out.println(text);
            count++;
        }
        
    }
}