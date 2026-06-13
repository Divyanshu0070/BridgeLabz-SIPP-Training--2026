package StringPractice.Level2;

import java.util.Scanner;

public class TrimLeadingAndTrailingSpaces {

    // Method to find start and end index (no leading/trailing spaces)
    public static int[] findTrimIndexes(String text) {

        int start = 0;
        int end = findLength(text) - 1;

        // Find first non-space character
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }

        // Find last non-space character
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // Find length without length()
    public static int findLength(String text) {
        int count = 0;

        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
        }

        return count;
    }

    // Create substring using charAt()
    public static String createSubstring(String text, int start, int end) {
        String result = "";

        for (int i = start; i <= end; i++) {
            result += text.charAt(i);
        }

        return result;
    }

    // Compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {

        if (s1.length() != s2.length()) return false;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text with spaces: ");
        String text = sc.nextLine();

        // User-defined trim
        int[] indexes = findTrimIndexes(text);
        String trimmedUser = createSubstring(text, indexes[0], indexes[1]);

        // Built-in trim
        String trimmedBuiltIn = text.trim();

        // Compare results
        boolean result = compareStrings(trimmedUser, trimmedBuiltIn);

        System.out.println("\nTrim using charAt(): '" + trimmedUser + "'");
        System.out.println("Trim using trim(): '" + trimmedBuiltIn + "'");
        System.out.println("Are both equal? " + result);

        sc.close();
    }
}