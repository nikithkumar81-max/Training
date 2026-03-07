package module4;

public class variableandmethod {
        static String college = "NPS  College";
        int usn;
        String name;

    variableandmethod(int i, String n) {
            usn = i;
            name = n;
        }
        static void changeCollege() {
            college = "Sapthagiri College";
        }

        void display() {
            System.out.println(usn + " " + name + " " + college);
        }

        public static void main(String args[]) {
            variableandmethod.changeCollege();
            variableandmethod s1 = new variableandmethod(74,"nikith");
            variableandmethod s2 = new variableandmethod(61,"kumar");
            s1.display();
            s2.display();
        }
    }