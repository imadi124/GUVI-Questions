import java.util.*;
public class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int result1 = (a+b)*c;
        int result2 = (b-d)/a;
        int result3 = (a*d)+c;
        int result4 = (a+b+c+d)/2;
        System.out.println("Result of operation 1 :"+result1);
        System.out.println("Result of operation 2 :"+result2);
        System.out.println("Result of operation 3 :"+result3);
        System.out.println("Result of operation 4 :"+result4);
        sc.close();
    }
}
