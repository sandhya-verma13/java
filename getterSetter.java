class Getter{
    int x;
    int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public int Add(){
        return x+y;
    }
}
public class getterSetter {
    public static void main(String[] args) {
        Getter gs=new Getter();
        gs.setX(6);
        gs.setY(6);
        System.out.println(gs.Add());
    }
}
