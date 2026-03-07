package module2;
import java.util.Scanner;
public class largestno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();
        int largest = a;  // Assume a is largest
        if (b > largest) {
            largest = b;  // Update if b is bigger
        }
        if (c > largest) {
            largest = c;  // Update if c is bigger
        }
        System.out.println(largest + " is the largest number.");
        sc.close();
    }
}
