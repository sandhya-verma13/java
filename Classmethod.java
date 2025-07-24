class Employee1 {
    int salary;
    String name;

    public int getsalary() {
        return salary;
    }

    public String getname() {
        return name;
    }

    public void setname(String n) {
        name = n;
    }
}
public class Classmethod{
    public static void main(String[] args){
        Employee1 sandhya=new Employee1();
        sandhya.salary=5000;
        sandhya.setname("CodeWithHarry");
        System.out.println(sandhya.getsalary());
        System.out.println(sandhya.getname());

    }
}
