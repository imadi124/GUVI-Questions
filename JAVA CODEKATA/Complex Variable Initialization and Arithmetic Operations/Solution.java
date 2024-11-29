import java.util.*;
public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float f1 =  sc.nextInt();
        float f2 = sc.nextInt();
        int num1 = (int)f1;
        int num2 = (int)f2;
        int andResult = num1&num2;
        int orResult = num1|num2;
        int xorResult = num1^num2;
        int notandResult = (~num1)&num2;
        System.out.println("Bitwise AND Result:"+andResult);
        System.out.println("Bitwise OR Result:"+orResult);
        System.out.println("Bitwise XOR Result:"+xorResult);
        System.out.println("Bitwise NOT and AND Result:"+notandResult);
        sc.close();


    }
}
