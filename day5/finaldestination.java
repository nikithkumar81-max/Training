package day5;
class breakingbad {
    void run(){
        System.out.println("running");
    }
}
class walterwhite extends breakingbad{
        @Override
        void run(){
            System.out.println("walter white");
        }
}
public class finaldestination {
    public static void main(String[] args) {
        final int MAX=100;
        System.out.println(MAX);
        walterwhite w=new walterwhite();
        w.run();
    }
}
