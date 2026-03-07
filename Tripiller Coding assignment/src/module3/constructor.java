package module3;

public class constructor {
        String NAME;
        int USN;
        constructor(String name, int usn ) {
            this.NAME = name;
            this.USN = usn;
        }
        void printdetails(){
            System.out.println("Student name is " +NAME);
            System.out.println("Student usn is " +USN);
        }
        public static void main(String[] args) {
            constructor s1 = new constructor("ram",74);
            constructor s2 = new constructor("raju",75);
            s1.printdetails();
            s2.printdetails();
        }
    }
