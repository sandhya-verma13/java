class Cellphone{
    public void ring(){
        System.out.println("Ringing....");
    }
    public void vibrate(){
        System.out.println("Vibrating....");
    }
    public void Callfriend(){
        System.out.println("Calling Sandhay");
    }

}

public class Methods{
    public static void main(String[] args){
        Cellphone asus=new Cellphone();
        asus.Callfriend();
        asus.vibrate();
        asus.ring();
    }
}