package task5;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 1;
        double factorial = 1;
        System.out.println("Enter your number : ");
        int number = sc.nextInt();

        if (number < 0) {
            System.out.println("Your number is not correct!! Please enter another number.");
        } else {
            for (x = 1; x <= number; x++) {
                factorial = factorial * x;
            }
            System.out.println("Factorial " + x + " is = " + factorial);
        }
    }
}