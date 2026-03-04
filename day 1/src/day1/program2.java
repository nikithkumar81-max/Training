package day1;

public class program2 {
    public static void main(String[] args) {
        int a,b;
        a = 130;b = 128;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(" a = " + a + ", b = "+b);
    }
}
