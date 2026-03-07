package module4;

public class staticblock {
    static int num;
    static {
        num = 100;
        System.out.println("Static Block Executed");
    }

    public static void main(String[] args) {
        System.out.println("Main Block Executed");
    }
}
