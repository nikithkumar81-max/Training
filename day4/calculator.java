package day4;
class calculator{
    void add(){
        int a=10;
        int b=20;
        System.out.println("sum = "+(a+b));
 }
int add(int a, int b){
    return a+b;
}
double add(double a, double b){
    return a+b;
}
float add(float a,float b) {
    return a+b;
}
}
class overloading{
    public static void main(String[] args) {
        calculator c=new calculator();
        c.add();
        System.out.print("integers"+c.add(4,5));
        System.out.print("double"+c.add(4.5,6.7));
        System.out.print("float"+c.add(2.6f,4.6f));
    }
}
