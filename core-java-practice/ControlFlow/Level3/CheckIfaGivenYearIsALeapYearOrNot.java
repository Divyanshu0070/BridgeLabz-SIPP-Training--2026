package ControlFlow.Level3;

import java.util.Scanner;

public class CheckIfaGivenYearIsALeapYearOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        if (year < 1582) {
            System.out.println("Not a valid year for Gregorian calendar");
        } else {
            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                System.out.println("Year is a Leap Year");
            } else {
                System.out.println("Not a Leap Year");
            }
        }

        sc.close();
    }
}