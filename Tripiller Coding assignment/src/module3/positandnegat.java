package module3;

public class positandnegat {
    void num ( int n){
        if (n > 0) {
            System.out.println(n + " is positive");
        } else if (n < 0) {
            System.out.println(n + " is negative");
        } else {
            System.out.println("the number is zero");
        }
    }
    public static void main(String[] args) {
        positandnegat obj = new positandnegat();
        obj.num(+78);
        obj.num(+87);
        obj.num(0);
    }
}
