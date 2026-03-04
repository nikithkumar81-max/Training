package day4;
class vehicle{
    void run(){
        System.out.println("vehicle is running");
    }
}
class bus extends vehicle{
    void run(){
        System.out.println(" bus is running smoothly");
    }
}
public class overiding {
    public static void main(String[] args) {
        vehicle b=new bus();
        b.run();
        vehicle v=new vehicle();
        v.run();
        bus b1=new bus();
        b1.run();
    }
}
