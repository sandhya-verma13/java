class RectangleCustomParameter{
    int length;
    int breadth;

    public RectangleCustomParameter(int length) {
        this.length = length;
    }

    public RectangleCustomParameter(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public int len(){
        return length*breadth;
    }
}
public class RectangleLBUsingConstructor {
    public static void main(String[] args) {
        RectangleCustomParameter rc=new RectangleCustomParameter(4);
        RectangleCustomParameter rc1=new RectangleCustomParameter(5,6);
        System.out.println(rc.len());
        System.out.println(rc1.len());
    }
}
