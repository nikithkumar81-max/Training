package day4;
class bank{
    double getinterestrate(){
        return 5.0;
    }
}
class savingbank extends bank{
    double getinterestrate(){
        return 7.5;
    }
}
public class runtime {
    public static void main(String[] args) {
        bank b=new savingbank();
        System.out.println("interest rate="+b.getinterestrate());
    }
}
