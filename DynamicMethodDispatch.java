class Phone{
    public void On(){
        System.out.println("I am a Phone");
    }
    public void Name(){
        System.out.println("I am a Nokia Phone..");
    }
}
class SmartPhone extends Phone{
    public void out(){
        System.out.println("I am a Smart phone");
    }
    public void Name(){
        System.out.println("I am a Asus Phone...");
    }
}
public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Phone ob=new SmartPhone();
//        ob.out();    -----> Not allowed
        ob.On();
        ob.Name();
    }
}
