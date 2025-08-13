class Mythr extends Thread{
    public Mythr(String name){
        super(name);
    }
    public void run(){
        int i=0;
        while(i<10){
            System.out.println("I am Thread");
            i++;
        }
    }

}
public class ThreadConstructor {
    public static void main(String[] args) {
        Mythr th=new Mythr("Sandhya");
        th.start();
        System.out.println("I am thread Id : "+th.getId());
        System.out.println("I am thread Name : "+th.getName());

    }
}
