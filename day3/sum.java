package day3;

public class sum {
    int Add(int a, int b) {
        int add = a+b;
        return add;
    }
    void display() {
        System.out.println("Hello users");
    }
    public static void main(String[] args) {
        sum ob=new sum();
        System.out.println(ob.Add(5, 6));//function call
        System.out.println(ob.Add(10, 6));
        ob.display();
    }
}