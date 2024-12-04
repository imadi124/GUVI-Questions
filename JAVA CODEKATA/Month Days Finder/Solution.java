import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int month = sc.nextInt();
            int year = sc.nextInt();

            if (month == -1 && year == -1) {
                break;
            }

            if (month < 1 || month > 12) {
                System.out.println("Invalid month");
                continue; // Skip the rest of the loop for invalid input
            }

            int daysinmonth;

            switch (month) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    daysinmonth = 31;
                    break;

                case 4: case 6: case 9: case 11:
                    daysinmonth = 30;
                    break;

                case 2:
                    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                        daysinmonth = 29; // Leap year
                    } else {
                        daysinmonth = 28; // Non-leap year
                    }
                    break;

                default:
                    daysinmonth = 0; // This should never happen due to prior validation
            }

            System.out.println(daysinmonth);
        }

        sc.close();
    }
}
