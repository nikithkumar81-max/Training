package module5;

public class arthmetic {
    public static void main(String[] args) {
        int i = 20, j = 2, k = 0;
        try {
            k = i / j;
            System.out.println(k);

        } catch (ArithmeticException e) {
            System.out.println(" you cant divide anything by zero");
        }
    }
}
