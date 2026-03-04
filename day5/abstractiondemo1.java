package day5;
abstract class appliance{
    abstract void turnon();
    void plugin(){
        System.out.println("appliance is plugged in");
    }
}
class fan extends appliance{
    @Override
    void turnon() {
        System.out.println("fan is spinning");
    }
}
public class abstractiondemo1 {
    public static void main(String[] args) {
        appliance a=new fan();
        a.plugin();
        a.turnon();
    }
}
