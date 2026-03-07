package module4;

public class finalclass {
        void eat() {
            System.out.println(" i am veg ");
        }
    }
    class Dog extends finalclass{
        void eat(){
            System.out.println(" I am nonveg ");
        }
    }
    class display{
        public static void main(String[] args) {
            Dog d=new Dog();
            d.eat();
        }
    }
