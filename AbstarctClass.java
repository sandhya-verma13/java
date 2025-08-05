abstract class Base2{
    Base2(){
        System.out.println("I am the Constructor of Base2 Class");
    }
    public void sayhello(){
        System.out.println("Hello !!");
    }
    abstract public void greet();
    abstract public void greet2();
}
class Derived2 extends Base2{
    @Override
    public void greet(){
        System.out.println("Good Morning....");
    }
    @Override
    public void greet2(){
        System.out.println("Good Night....");
    }
}
abstract class Derived3 extends Base2{
    public void th(){
        System.out.println("Th");
    }
}
public class AbstarctClass {
    public static void main(String[] args) {
        Derived2 d2=new Derived2();
        d2.greet();
        d2.greet2();
        // we cannot creat the object of the class Derived 3 and Base2 its shows errorsc
   }
}
