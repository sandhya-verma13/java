class Tommy{
    public void hitting(){
        System.out.println("Hitting the Enemy....");
    }
    public void running(){
        System.out.println("Running from the Enemy....");
    }
    public void firing(){
        System.out.println("Firing the Enemy....");
    }
}
public class TommyVercetil {
    public static void main(String[] args) {
        Tommy t=new Tommy();
        t.hitting();
        t.running();
        t.firing();
    }

}
