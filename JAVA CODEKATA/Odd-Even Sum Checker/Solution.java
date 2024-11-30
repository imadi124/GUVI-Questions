import java.util.*;
public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int oddSum =0;
        int evenSum = 0;
        int num;
        while(true){
          num = sc.nextInt();
          if(num==-1){
            break;
          }

          if (num%2 == 0){
            evenSum += num;
          }else{
            oddSum+=num;
        }

        }
        if (oddSum>evenSum){
            System.out.println("Odd sun greater");
        }else if (evenSum>oddSum){
            System.out.println("Even sum greater");
        }else{
            System.out.println("Equal");
        }
        sc.close();
    }
}
