class CircleClass{
    public int radius;
    CircleClass(int r){
        this.radius=r;
    }
    public double area(){
        System.out.println("The Area of Circle is : ");
        return Math.PI*radius*radius;
    }
}
class CylindereClass extends CircleClass{
    public int height;
    CylindereClass(int r,int h){
        super(r);
        this.height=h;
    }
    public double volume(){
        System.out.println("The volume of Cylinder is : ");
        return Math.PI*radius*radius*height;
    }
}
public class InheritanceUsingClass {
    public static void main(String[] args) {
        CylindereClass cy=new CylindereClass(4,6);
        System.out.println(cy.volume());
        System.out.println(cy.area());
    }
}
