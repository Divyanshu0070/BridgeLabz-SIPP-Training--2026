package MethodPractice.Level1;

import java.util.Scanner;

public class CheckNumberIsPositiveNegativeZero {


    public static int checkNumber(int number) {
        if (number > 0) {
            return 1;   // Positive
        } else if (number < 0) {
            return -1;  // Negative
        } else {
            return 0;   // Zero
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int result = checkNumber(number);


        if (result == 1) {
            System.out.println(number + " is a Positive Number");
        } else if (result == -1) {
            System.out.println(number + " is a Negative Number");
        } else {
            System.out.println(number + " is Zero");
        }

        sc.close();
    }
}