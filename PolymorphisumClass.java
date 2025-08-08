abstract class Telephone{
    abstract void Ring();
    abstract void lift();
    abstract void disconnected();
}
class SmartTelephone extends Telephone{
    void daile(){
        System.out.println("Dailing....");
    }
    @Override
    void Ring() {
        System.out.println("Ringing....");
    }

    @Override
    void lift() {
        System.out.println("Lifting.....");
    }

    @Override
    void disconnected() {
        System.out.println("Disconnected....");
    }
}
public class PolymorphisumClass {
    public static void main(String[] args) {
        Telephone t1=new SmartTelephone();
        t1.disconnected();
    }
}
