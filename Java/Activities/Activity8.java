package activities;

public class Activity8 {

    public static void exceptionTest(String value) throws CustomException {
        if (value == null) {
            throw new CustomException("Custom Error: String value cannot be null!");
        } else {
            System.out.println("Value: " + value);
        }
    }

    public static void main(String[] args) {
        try {
            // Call with non-null string
            exceptionTest("Hello World!");

            // Call with null argument
            exceptionTest(null);

        } catch (CustomException e) {
            // Print custom exception message
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}

class CustomException extends Exception {
    private String message;

    public CustomException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}

