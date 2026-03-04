package day5;
interface animal{
    void sound();
    default void bite(){

    }
}
class cat implements animal{
    @Override
    public void sound(){
        System.out.println("meow meow");
    }
}
public class interfacedemo {
    public static void main(String[] args) {
        animal c=new cat();
        c.sound();
        c.bite();

    }
}
