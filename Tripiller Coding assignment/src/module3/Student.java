package module3;

public class Student {
    String name;
    int marks;
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
    public static void main(String[] args) {
        Student  s1 = new Student ();
        s1.name = "Tarun";
        s1.marks = 90;
        s1.display();
    }
}


