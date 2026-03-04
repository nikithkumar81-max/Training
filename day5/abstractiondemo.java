package day5;
abstract class shape{
    abstract void draw();
    void area(){
        System.out.println("area of a shape");
    }
}
class circle extends shape{
    @Override
        void draw(){
            System.out.println("drawing a circle");
        }
    }
public class abstractiondemo {
    public static void main(String[] args) {
        shape s=new circle();
        s.draw();
        s.area();
    }
}
