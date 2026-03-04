package day2;

import java.util.Scanner;

public class vibgyor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character(V,I,B,G,Y,O,R): ");
        char op = sc.next().charAt(0);
        String color;
        switch(op){
        case 'V': color = "Violet";break;
        case 'I': color = "Indigo";break;
        case 'B': color = "Blue";break;
        case 'G': color = "Green";break;
        case 'Y': color = "Yellow";break;
        case '0': color = "Orange";break;
        case 'R': color = "Red";break;
        default: color = "invalid color";
    }
    System.out.println("Color="+color);

    }
}
