package module2;
import java.util.Scanner;
public class multiplytable {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the num");
            int num = sc.nextByte();
            for (int i = 1; i < 11; i++) {
                System.out.println(num + " x " + i + "=" + num * i);
            }
        }
    }
