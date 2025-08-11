class MyThread1 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<50){
            System.out.println("I am Thread1 ");
            System.out.println("I am good");
            i++;
        }
    }
}
class MyThread2 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<50){
            System.out.println("I am Thread2 ");
            System.out.println("I am sad");
            i++;
        }
    }
}
public class ThreadClass {
    public static void main(String[] args) {
        MyThread1 t1=new MyThread1();
        MyThread2 t2=new MyThread2();
        t1.start();
        t2.start();
    }
}
