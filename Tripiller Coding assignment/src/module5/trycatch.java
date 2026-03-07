package module5;

public class trycatch {
    public static void main(String[] args) {
        try {
            int a=10, b=0 ,c;
            c = a / b;   // this will cause exception
            System.out.println("Result: " + c);
        }

        catch (ArithmeticException e) {
            System.out.println(" Arithmetic error");
        }

        finally {
            System.out.println(" thank you");
        }
    }
}
