package module3;

public class addmethod {
    int add(int a, int b) {
        return a + b;
    }
    int subtract(int a, int b) {
        return a - b;
    }
    public static void main(String[] args) {
        addmethod obj = new addmethod();
        int sum = obj.add(10, 5);
        int difference = obj.subtract(10, 5);
        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + difference);
    }
}
