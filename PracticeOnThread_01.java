class MyThreadPractice1 extends Thread{
    public void run(){
        int i=0;
        while(i<50){
            System.out.println("Good Morning!!");
            i++;
        }
    }
}
class MyThreadPractice2 extends Thread{
    public void run(){
        int i=0;
        while(i<50){
            System.out.println("Welcom!!!");
            try {
                Thread.sleep(200);
            }catch (Exception e){
                System.out.println(e);
            }
            i++;
        }
    }
}
public class PracticeOnThread_01 {
    public static void main(String[] args) {
        MyThreadPractice1 t1=new MyThreadPractice1();
        MyThreadPractice2 t2=new MyThreadPractice2();
        t1.setPriority(4);
        t2.setPriority(9);
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t2.getState());
        System.out.println(Thread.currentThread().getState());

        t1.start();
        t2.start();


    }
}
