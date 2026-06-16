package MethodPractice.Level3;

import java.util.Scanner;

public class ThreePointsColinear {

    public static boolean checkCollinearUsingSlope(int x1, int y1, int x2, int y2, int x3, int y3) {

        double slopeAB = (double) (y2 - y1) / (x2 - x1);
        double slopeBC = (double) (y3 - y2) / (x3 - x2);

        return slopeAB == slopeBC;
    }

    public static boolean checkCollinearUsingArea(int x1, int y1, int x2, int y2, int x3, int y3) {

        int area = (x1 * (y2 - y3) +
                x2 * (y3 - y1) +
                x3 * (y1 - y2));

        return area == 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x1: ");
        int x1 = sc.nextInt();

        System.out.print("Enter y1: ");
        int y1 = sc.nextInt();

        System.out.print("Enter x2: ");
        int x2 = sc.nextInt();

        System.out.print("Enter y2: ");
        int y2 = sc.nextInt();

        System.out.print("Enter x3: ");
        int x3 = sc.nextInt();

        System.out.print("Enter y3: ");
        int y3 = sc.nextInt();

        boolean slopeResult = checkCollinearUsingSlope(x1, y1, x2, y2, x3, y3);
        boolean areaResult = checkCollinearUsingArea(x1, y1, x2, y2, x3, y3);

        if (slopeResult && areaResult) {
            System.out.println("The three points are Collinear");
        } else {
            System.out.println("The three points are not Collinear");
        }

        sc.close();
    }
}