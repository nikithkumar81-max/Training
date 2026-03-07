package module4;
public class immutable {
    public static void main(String[] args) {
        String s1="Nikith";
        s1.concat("kumar");
        System.out.println(s1);
        String s2 =s1.concat(" kumar");
        System.out.println(s2);
    }
}
