interface MyCamera{
    void takePhoto();
    void savePhoto();
    void deletePhoto();
}
interface MyMusic{
    String[] getsongs();
    void listen(String song);
}
class MyPhone1{
    void callphone(int phno){
        System.out.println("Calling "+phno);
    }
    void attendcall(){
        System.out.println("Attending the call...");
    }
}
class Mysmartcell extends MyPhone1 implements MyCamera,MyMusic{
    public void takePhoto(){
        System.out.println("Taking photos.....");
    }
    public void savePhoto(){
        System.out.println("Saving photos.....");
    }
    public void deletePhoto(){
        System.out.println("Deleting photos.....");
    }
    public String[] getsongs(){
        System.out.println("List of Songs....");
        String[] SongSname={"lover","shapeOfYou","Friends","The End"};
        return SongSname;
    }
    public void listen(String songs){
        System.out.println("Listen songs......"+songs);
    }
}
public class InterfaceClass {
    public static void main(String[] args) {
        Mysmartcell my=new Mysmartcell();
        String[] ar= my.getsongs();
        for(String item:ar){
            System.out.println(item);
        }
        my.listen("lover");
    }
}
