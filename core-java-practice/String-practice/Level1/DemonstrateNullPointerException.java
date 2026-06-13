package StringPractice.Level1;

public class DemonstrateNullPointerException {

    // Method to generate NullPointerException
    public static void generateException() {
        String text = null;

        // This line will throw NullPointerException
        System.out.println(text.length());
    }

    // Method to handle NullPointerException
    public static void handleException() {
        String text = null;

        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught!");
            System.out.println("Cannot call methods on a null String.");
        }
    }

    public static void main(String[] args) {

        // Uncomment this method call to see the exception
        // generateException();

        // Refactored code: handling the exception
        handleException();
    }
}