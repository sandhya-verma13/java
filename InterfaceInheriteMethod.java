interface Tvremote{
    void on();
    void off();
}
interface SmartTvremote{
    void play();
    void stop();
}
class Remote implements Tvremote,SmartTvremote{
    @Override
    public void on() {
        System.out.println("TV is ON....");
    }

    @Override
    public void off() {
        System.out.println("TV is OFF...");
    }

    @Override
    public void play() {
        System.out.println("Play the TV....");
    }

    @Override
    public void stop() {
        System.out.println("Stop the TV......");
    }
}
public class InterfaceInheriteMethod {
    public static void main(String[] args) {
        Remote r=new Remote();
        r.off();
        r.on();
        r.play();
        r.stop();
    }
}
