package module4;

public class garbage {
    public void finalize() {
        System.out.println("Garbage collection");
    }
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            garbage obj = new garbage();
        }
        System.gc();
    }
}
