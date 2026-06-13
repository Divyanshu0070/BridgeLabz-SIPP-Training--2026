package StringPractice.Level2;

import java.util.Scanner;

public class SplitTextIntoWordsWith2DArray {

    // Find length without using length()
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

    // Split text into words without using split()
    public static String[] splitWords(String text) {

        int length = findLength(text);

        int wordCount = 1;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];

        int start = 0;
        int index = 0;

        for (int i = 0; i <= length; i++) {

            if (i == length || text.charAt(i) == ' ') {

                String word = "";

                for (int j = start; j < i; j++) {
                    word += text.charAt(j);
                }

                words[index++] = word;
                start = i + 1;
            }
        }

        return words;
    }

    // Create 2D array containing word and its length
    public static String[][] getWordAndLength(String[] words) {

        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {

            result[i][0] = words[i];

            int len = findLength(words[i]);

            result[i][1] = String.valueOf(len);
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = splitWords(text);

        String[][] wordData = getWordAndLength(words);

        System.out.println("\nWord\t\tLength");
        System.out.println("-------------------");

        for (int i = 0; i < wordData.length; i++) {

            String word = wordData[i][0];
            int length = Integer.parseInt(wordData[i][1]);

            System.out.println(word + "\t\t" + length);
        }

        sc.close();
    }
}