class  Base1{
    Base1(){
        System.out.println("I am a Constructor...");
    }
    Base1(int x){
        System.out.println(x);
    }
}
class Derived extends Base1{
    Derived(){
        super(10);
        System.out.println("I am  a derived class constructor....");
    }
}

public class ConstructorInInheritance {
    public static void main(String[] args) {
        Derived d=new Derived();

    }
}
