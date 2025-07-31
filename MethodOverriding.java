class A{
    public int a;
    public  int sandy(){
        return 2;
    }
    public  void Method2(){
        System.out.println("I am Method 2 of class A");
    }
}
class B extends A{
    @Override
    public  void Method2(){
        System.out.println("I am Method 2 of class B");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        A a=new A();
        a.Method2();
        B b=new B();
        b.Method2();


    }
}
