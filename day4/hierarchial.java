package day4;
class  human{
    void eat(){
        System.out.println("humans eats pani puri");
    }
}
class shaktiman extends  human{
    void saveworld(){
        System.out.println("saving the world");
    }
}
class gangadhar extends human{
    void earn(){
        System.out.println(" gangadhar works as a reporter");
    }
}
 public class hierarchial {
    public static void main(String[] args){
        shaktiman s=new shaktiman();
        s.eat();
        s.saveworld();


        gangadhar g=new gangadhar();
        g.eat();
        g.earn();

    }
}
