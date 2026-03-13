package module8;
public class palindrome {
    public static void main(String[] args) {
        String s = "madam";
        String rev = "";
        for(int i=s.length()-1;i>=0;i--){
            rev += s.charAt(i);
        }
        if(s.equals(rev))
            System.out.println("The given String is a Palindrome");
        else
            System.out.println("The given String is not a Palindrome");
    }
}