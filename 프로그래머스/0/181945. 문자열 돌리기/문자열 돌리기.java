import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] cArray = sc.nextLine().toCharArray();      
        for(char c : cArray){
            System.out.println(c);
        }
    }
}