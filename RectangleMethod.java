class Rectangle{
    int l;
    int b;
    public int area(){
        return l*b;
    }
    public int perimeter(){
        return 2*(l+b);
    }
}
public class RectangleMethod {
    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        r.l=2;
        r.b=3;
        System.out.println(r.area());
        System.out.println(r.perimeter());
    }
}
