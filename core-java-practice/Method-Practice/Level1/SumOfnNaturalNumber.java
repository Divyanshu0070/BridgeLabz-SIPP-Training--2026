package MethodPractice.Level1;

import java.util.Scanner;

public class SumOfnNaturalNumber {


    public static int findSum(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();


        int sum = findSum(n);


        System.out.println("The sum of first " + n + " natural numbers is " + sum);

        sc.close();
    }
}