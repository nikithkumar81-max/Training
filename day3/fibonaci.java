package day3;
import java.util.Scanner;
public class fibonaci {
    void fib(int n) {
        int a=0,b=1,c;
        System.out.print("Fibonacci Series: ");
        for (int i=0;i<=n;i++) {
            System.out.print(a + " ");
            c=a+b;
            a=b;
            b=c;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        fibonaci ob = new fibonaci();
        ob.fib(n);
    }
}

