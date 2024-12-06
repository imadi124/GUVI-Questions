import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        class car {
            private String make;
            private String model;
            private int year;

           
            public car(String make, String model, int year) {
                this.make = make;
                this.model = model;
                this.year = year;
            }

          
            public int getCarAge(int currentYear) {
                if (year > currentYear) {
                    return -1; // Invalid case: year of car is in the future
                } else {
                    return currentYear - year;
                }
            }

          public void displayCarDetails() {
                System.out.println("Make: " + make);
                System.out.println("Model: " + model);
                System.out.println("Year: " + year);
            }
        }
        System.out.print("Enter car make: ");
        String make = sc.nextLine();
        System.out.print("Enter car model: ");
        String model = sc.nextLine();
        System.out.print("Enter car year: ");
        int year = sc.nextInt();
        System.out.print("Enter the current year: ");
        int currentYear = sc.nextInt();

       
        car myCar = new car(make, model, year);
        int carAge = myCar.getCarAge(currentYear);
      
        myCar.displayCarDetails();
        if (carAge == -1) {
            System.out.println("Invalid input: Car year cannot be in the future.");
        } else {
            System.out.println("Car Age: " + carAge + " years");
        }
        sc.close();
    }
}
