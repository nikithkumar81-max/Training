package day4;
class person{
    String name;
    person(String name){
        this.name=name;
    }
    void walk(){
        System.out.println(name+ "is walking");
    }
}
class student extends person{
    student(String name){
        super(name);
    }
    void study(){
        System.out.println(name+"is studying");
    }
}
class professor extends person{
    professor(String name){
        super(name);
    }
    void teach(){
        System.out.println(name+" is teaching");
    }
}
public class collegelife {
    public static void main(String[] args) {
    student s=new student("nikhil");
    s.walk();
    s.study();
    professor p=new professor("gc");
    p.walk();
    p.teach();
    }
}
