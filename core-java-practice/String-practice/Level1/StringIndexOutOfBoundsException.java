package StringPractice.Level1;

public class StringIndexOutOfBoundsException {

    // Method to generate StringIndexOutOfBoundsException
    public static void generateException() {
        String text = "Hello";

        // Invalid index (valid indexes are 0 to 4)
        System.out.println(text.charAt(10));
    }

    // Method to handle StringIndexOutOfBoundsException
    public static void handleException() {
        String text = "Hello";

        try {
            System.out.println(text.charAt(10));
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught!");
            System.out.println("Invalid index used while accessing the string.");
        }
    }

    public static void main(String[] args) {

        // Uncomment to generate the exception
        // generateException();

        // Handle the exception
        handleException();
    }
}