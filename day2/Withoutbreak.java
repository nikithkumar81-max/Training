package day2;

import java.util.Scanner;

public class Withoutbreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character(V,I,B,G,Y,O,R): ");
        char ch = sc.next().charAt(0);
        ch= Character.toUpperCase(ch);
        String color = switch (ch) {
            case 'V'->{yield "Voilet";}
            case 'I'->{yield "Indigo";}
            case 'B'->{yield "Blue";}
            case 'G'->{yield "Green";}
            case 'Y'->{yield "Yellow";}
            case 'O'->{yield "Orange";}
            case 'R'->{yield "Red";}
            default->{yield "Invalid Input";}
        };
        System.out.println("Color="+color);

    }
}
