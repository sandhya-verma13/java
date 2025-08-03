class Brother{
    Brother(){
        System.out.println("I have One Sister...name Sandhya...");
    }
}
class Sister extends Brother{
    Sister(){
        System.out.println("I have Two Brother...name Sathish and Manish.....");
    }
}
public class ExtendMethod {
    public static void main(String[] args) {
        Brother b= new Brother();

    }
}
