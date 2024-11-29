import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter three integers:");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            
            if (a % 2 == 0) {
                a += b;
                System.out.println("After a % 2 == 0: a = " + a);
            }
            if (b % 2 != 0) {
                c *= 2;
                System.out.println("After b % 2 != 0: c = " + c);
            }
            if (c % 3 == 0) {
                c += a;
                System.out.println("After c % 3 == 0: c = " + c);
            }
            if (a + b + c > 100) {
                a -= 100;
                b -= 100;
                c -= 100;
                System.out.println("After a + b + c > 100: a = " + a + ", b = " + b + ", c = " + c);
            }
            
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter integers only.");
        } finally {
            sc.close();
        }
    }
}
