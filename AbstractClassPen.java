abstract class Pen{
    abstract void write();
    abstract void refill();
}
class FountainPen extends Pen{
    void write(){
        System.out.println("Writting...");
    }
    void refill(){
        System.out.println("Refilling...");
    }
    void changingNib(){
        System.out.println("Changing the Nib Of the Pen...");
    }
}
public class AbstractClassPen {
    public static void main(String[] args) {
        FountainPen pen=new FountainPen();
        pen.changingNib();
    }
}
