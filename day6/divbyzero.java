package day6;
import java.util.Scanner;
public class divbyzero {
    static int divide(int a, int b)throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("division by ");
        }
        return a/b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 2 numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        try{
            int result=divide(a,b);
            System.out.println(result);
        }

        catch(ArithmeticException e){
            System.out.println("exception caught :"+e.getMessage());
        }
    }
}
