package MethodPractice.Level3;

import java.util.Arrays;

public class ShortestTallestMeanHeight {

    public static int[] generateHeights() {
        int[] heights = new int[11];

        for (int i = 0; i < heights.length; i++) {
            heights[i] = (int) (Math.random() * 101) + 150;
        }

        return heights;
    }

    public static int findSum(int[] heights) {
        int sum = 0;

        for (int height : heights) {
            sum += height;
        }

        return sum;
    }

    public static double findMean(int[] heights) {
        return (double) findSum(heights) / heights.length;
    }

    public static int findShortest(int[] heights) {
        int shortest = heights[0];

        for (int height : heights) {
            if (height < shortest) {
                shortest = height;
            }
        }

        return shortest;
    }

    public static int findTallest(int[] heights) {
        int tallest = heights[0];

        for (int height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }

        return tallest;
    }

    public static void main(String[] args) {

        int[] heights = generateHeights();

        System.out.println("Player Heights: " + Arrays.toString(heights));

        System.out.println("Total Height = " + findSum(heights) + " cm");
        System.out.println("Mean Height = " + findMean(heights) + " cm");
        System.out.println("Shortest Height = " + findShortest(heights) + " cm");
        System.out.println("Tallest Height = " + findTallest(heights) + " cm");
    }
}