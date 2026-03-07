package module5;

public class throwskeyword {
    static void divide(int a, int b) throws ArithmeticException {
        int result = a / b;
        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {
        try {
            divide(100, 0);
        }
        catch (ArithmeticException e) {
            System.out.println("Exception caught: Division by zero");
        }
    }
}

