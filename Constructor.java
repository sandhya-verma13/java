class MyEmployee{
    int id;
    int salary;
    String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class Constructor {
    public static void main(String[] args) {
        MyEmployee sandhya=new MyEmployee();
        sandhya.setId(34);
        sandhya.setSalary(10000);
        sandhya.setName("CodeWithHarry");
        System.out.println(sandhya.getName());
        System.out.println(sandhya.getId());
        System.out.println(sandhya.getSalary());

    }
}
