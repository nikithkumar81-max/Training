package day3;
import java.util.Scanner;
public class square {
    int Square(int n)
    {
        return n*n;
    }
    public static void main(String[] args) {
        square ob=new square();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(ob.Square(n));

    }
}


