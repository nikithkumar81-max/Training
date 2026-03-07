package module3;
public class Person {
    private String name;
    private int age;
    public void setName(String n) {
        name = n;
    }
    public String getName() {
        return name;
    }
    public void setAge(int a) {
        if (a > 0) {
            age = a;
        } else {
            System.out.println("Invalid Age!");
        }
    }
    public int getAge() {
        return age;
    }
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("Rahul");
        p1.setAge(20);
        System.out.println("Name: " + p1.getName());
        System.out.println("Age: " + p1.getAge());
    }
}