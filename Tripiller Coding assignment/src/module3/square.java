package module3;
public class square {
    int findSquare(int n) {
        return n * n;
    }
    public static void main(String[] args) {
        square obj = new square();
        int number = 5;
        int result = obj.findSquare(number);
        System.out.println("Square of " + number + " is " + result);
    }
}
