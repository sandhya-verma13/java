class RectangleClass{
    public int lenght,width;

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    RectangleClass(int l, int w){
        this.lenght=l;
        this.width=w;
    }
    public int area(){
        System.out.println("The Area of Rectangle is : ");
        return lenght*width;
    }
}
class Cuboid extends RectangleClass{
    public int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    Cuboid(int l, int w, int h){
        super(l,w);
        this.height=h;
    }
    public int volume(){
        System.out.println("The volume of Cuboid is : ");
        return lenght*width*height;
    }
}
public class InheritanceUsingClass2 {
    public static void main(String[] args) {
        Cuboid cb=new Cuboid(4,5,7);
        System.out.println(cb.area());
        System.out.println(cb.volume());
    }
}
