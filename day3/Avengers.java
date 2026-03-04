package day3;

public class Avengers {
    String Name;
    Avengers(String Name){
        this.Name=Name;
    }
    void display()
    {
        System.out.println("Tony Stack :"+Name);
    }
    public static void main(String[] args) {
        Avengers a1=new Avengers("Iron Man");
        a1.display();
    }
}
