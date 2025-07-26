import java.util.Scanner;
class Student{
    int id;
    String name;
    int eng,math,sci,soc,com;
    int total;
    float avg;
    String grade;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getSci() {
        return sci;
    }

    public void setSci(int sci) {
        this.sci = sci;
    }

    public int getSoc() {
        return soc;
    }

    public void setSoc(int soc) {
        this.soc = soc;
    }

    public int getCom() {
        return com;
    }

    public void setCom(int com) {
        this.com = com;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public float getAvg() {
        return avg;
    }

    public void setAvg(float avg) {
        this.avg = avg;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", eng=" + eng +
                ", math=" + math +
                ", sci=" + sci +
                ", soc=" + soc +
                ", com=" + com +
                ", total=" + total +
                ", avg=" + avg +
                ", grade='" + grade + '\'' +
                '}';
    }

    public int total(){
        total=eng+math+sci+soc+com;
        return total;
    }
    public float average(){
        avg=total/5;
        return avg;
    }
    public String  grade(){
        if(avg>=90){
            return "A";
        } else if (avg>=80 && avg<90) {
            return "B";
        } else if (avg>=70 && avg<80) {
            return "C";
        } else if (avg>=60 && avg<70) {
            return "D";
        } else if (avg>=50 && avg<60) {
            return "E";
        }else{
            return "Your fail , Need to More concentrate !!!";
        }
    }
}
public class Student_grade_using_OOps {
    public static void main(String[] args) {
        Student sandy=new Student();

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your Id: ");
        int id=sc.nextInt();
        System.out.print("Enter your Name: ");
        String name=sc.next();
        System.out.print("Enter the English Mark: ");
        int e=sc.nextInt();
        System.out.print("Enter your Maths Mark:");
        int m=sc.nextInt();
        System.out.print("Enter the Science Mark: ");
        int sci=sc.nextInt();
        System.out.print("Enter your Social Mark:");
        int so=sc.nextInt();
        System.out.print("Enter the Computer Mark: ");
        int com=sc.nextInt();
        sandy.setId(id);
        sandy.setName(name);
        sandy.setEng(e);
        sandy.setMath(m);
        sandy.setSci(sci);
        sandy.setSoc(so);
        sandy.setCom(com);
//        System.out.println(sandy.getId());
//        System.out.println(sandy.getName());
//        System.out.println(sandy.getEng());
//        System.out.println(sandy.getMath());
//        System.out.println(sandy.getSci());
//        System.out.println(sandy.getSoc());
//        System.out.println(sandy.getCom());
        sandy.setTotal(sandy.total());
//        System.out.println("Total Mark: "+sandy.getTotal());
        sandy.setAvg(sandy.average());
//        System.out.println("Average : "+sandy.getAvg());
        sandy.setGrade(sandy.grade());
//        System.out.println("Grade : "+sandy.getGrade());
        System.out.println(sandy);










    }
}
