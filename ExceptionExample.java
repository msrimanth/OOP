public class ExceptionExample {
    public static void checkNumber(int number) throws Exception {
        if (number % 2 == 0) {
            throw new Exception("Even number not allowed");
        } else {
            System.out.println("Entered number is " + number);
        }
    }

    public static void main(String[] args) {
        try {
            checkNumber(9);
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
