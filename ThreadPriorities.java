class Mythr1 extends Thread{
    public Mythr1(String name){
        super(name);
    }
    public void run(){
        int i=0;
        while(i<456){
            System.out.println("I am Thread "+ this.getName());
            i++;
        }
    }
}
public class ThreadPriorities {
    public static void main(String[] args) {
        Mythr1 t1=new Mythr1("Sandhya1");
        Mythr1 t2=new Mythr1("Sandhya2");
        Mythr1 t3=new Mythr1("sandhya3");
        Mythr1 t4=new Mythr1("Sandhya4");
        Mythr1 t5=new Mythr1("Sandhya5 (most important)");
        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
