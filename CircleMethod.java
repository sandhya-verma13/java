class Circle{
    int a;
    public double area(){
        return 3.14*(a*a);
    }
    public double perimeter(){
        return 2*(3.14)*a;
    }
}
public class CircleMethod {
    public static void main(String[] args) {

        Circle c=new Circle();
        c.a=4;
        System.out.println(c.area());
        System.out.println(c.perimeter());
    }
}
