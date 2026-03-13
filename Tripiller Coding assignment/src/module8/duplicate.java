package module8;
public class duplicate {
    public static void main(String[] args) {
        String s = "sapthagiri college of engineering";
        String result = "";
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(result.indexOf(c) == -1){
                result += c;
            }
        }
        System.out.println(result);
    }
}