package day2;

import java.util.Scanner;

public class switchex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        switch(n){
            case 1: System.out.println("one");break;
            case 2: System.out.println("two");break;
            default:
                System.out.println("Invalid");
        }
    }
}
