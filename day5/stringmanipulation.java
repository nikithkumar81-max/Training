package day5;

public class stringmanipulation {
    public static void main(String[] args) {
        String st1 = "rocky";
        String st2 = "rocky";
        String st3 = "adheera";
        //using equals()
        System.out.println(st1.equals(st2));
        System.out.println(st1.equals(st2));

        //using compareto
        System.out.println(st1.compareTo(st2));
        System.out.println(st1.compareTo(st3));
        System.out.println(st3.compareTo(st1));
    }
}