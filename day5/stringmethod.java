package day5;

public class stringmethod {
    public static void main(String[] args) {
        String str = "ben 10";
        System.out.println("enter the String: "+str);
        System.out.println("length : " + str.length());
        System.out.println("upper case : " + str.toUpperCase());
        System.out.println("lowercase : " + str.toLowerCase());
        System.out.println("character at index :" + str.charAt(2));
        System.out.println("substring :" + str.substring(0, 3));
        String str1 = "alien force";
        System.out.println("concat :" + str.concat(str1));
        System.out.println("using +" + str + str);
        System.out.println("equals :" + str.equals("ben 10"));
        System.out.println("equalsIgnoreCase :" + str.equalsIgnoreCase("ben 10"));
    }
}


