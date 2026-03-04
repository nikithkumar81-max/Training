package day6;
import java.util.Scanner;
public class arrayindex {
    static void fetchElement(int[] arr, int index) throws ArrayIndexOutOfBoundsException {
        if (index < 0 || index >= arr.length) {
            throw new ArrayIndexOutOfBoundsException("index out of bounds");
        } else {
            System.out.println(arr[index]);
        }
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter one index");
        int index = sc.nextInt();
        try {
            fetchElement(arr,index);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Caught exception "+e.getMessage());
        }
        finally{
            System.out.println("Program Executed");
        }
    }

}
