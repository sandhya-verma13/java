class Monkey{
    void jump(){
        System.out.println("Jumping....");
    }
    void bite(){
        System.out.println("Bite....");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal{
    void run(){
        System.out.println("Running....");
    }
    @Override
    public  void eat(){
        System.out.println("Eatting....");
    }
    @Override
    public void sleep(){
        System.out.println("Sleeping.....");
    }
}
public class ClassMonkey {
    public static void main(String[] args) {
        Human h=new Human();
        h.sleep();
        Monkey m1=new Human();
//       m1.speak();----> its shows error because it cant not access we can only use monkey class method.
        m1.jump();
    }
}
