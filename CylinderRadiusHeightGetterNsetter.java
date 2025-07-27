class Cylinder{
    private int radius;
    int height;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "radius=" + radius +
                ", height=" + height +
                '}';
    }
    public double surfaceArea(){
        return 2*(3.14)*radius*(radius+height);
    }
    public double volume(){
        return (3.14*(radius*radius)*height);
    }
}
public class CylinderRadiusHeightGetterNsetter {
    public static void main(String[] args) {
        Cylinder cy=new Cylinder();
        cy.setRadius(6);
        cy.setHeight(9);
        System.out.println(cy);
        System.out.println("The Surface Area of Cylinder is : "+cy.surfaceArea());
        System.out.println("The Volume of Cylinder is : "+cy.volume());

    }
}
