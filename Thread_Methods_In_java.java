class MyNewthr1 extends Thread{

    public void run(){
        int i=0;
        while(i<456){
            System.out.println("I am Thread 1");
            try {
                Thread.sleep(3443344);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            i++;
        }
    }
}
class MyNewthr2 extends Thread{
    public void run(){
        int i=0;
        while(i<456){
            System.out.println("I am Thread 2");
            i++;
        }
    }
}
public class Thread_Methods_In_java {
    public static void main(String[] args) {
        MyNewthr1 t1=new MyNewthr1();
        MyNewthr2 t2=new MyNewthr2();
        t1.start();
//        try{
//            t1.join();
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }

        t2.start();


    }
}
