package shape;
class Square{
    private int a=4;
    int area(){
        System.out.println("The Area of Square is : ");
        return a*a;
    }
    int perimeter(){
        System.out.println("The Perimeter Of the Square is : ");
        return 4*a;
    }
}
class Rectangle{
    private int l=2;
    private int w=3;
    int area(){
        System.out.println("The Area of Rectangle is : ");
        return l*w;
    }
    int perimeter(){
        System.out.println("The Perimeter of Rectangle is : ");
        return 2*(l+w);
    }
}
class Circle{
    private int r=6;
    double area(){
        System.out.println("The Area of Circle is : ");
        return Math.PI*r*r;
    }
    double perimeter(){
        System.out.println("The Perimeter of Circle is : ");
        return 2*Math.PI*r;
    }
}

public class ShapePackage {
    public static void main(String[] args) {
        Square sq=new Square();
        System.out.println(sq.area());
        System.out.println(sq.perimeter());
        Rectangle rc=new Rectangle();
        System.out.println(rc.area());
        System.out.println(rc.perimeter());
        Circle c=new Circle();
        System.out.println(c.area());
        System.out.println(c.perimeter());
    }
}
