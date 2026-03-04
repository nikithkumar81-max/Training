package day4;
class apple
{
    String brand="apple";
    apple(){
        System.out.println("apple constructor");
    }
    void showbrand(){
        System.out.println("brand:"+brand);
    }
}
class iphone extends apple{
    String brand="iphone 17";
    iphone(){
        super();
        System.out.println(" iphone constructor called");
    }
    void display(){
        System.out.println("model:"+brand);
        System.out.println("company "+super.brand);
        super.showbrand();
    }
}
 class Super {
    public static void main(String[] args) {
        iphone obj=new iphone();
        obj.display();
    }
}
