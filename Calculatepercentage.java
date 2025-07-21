import java.util.Scanner;
public class Calculatepercentage{
    public static void main(String[] args){
        System.out.println("Calculate the Percentage of Marks");
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the Subect1 Mark: ");
        int m1=sc.nextInt();
        
        System.out.println("Enter the Subect2 Mark: ");
        int m2=sc.nextInt();
        
        System.out.println("Enter the Subect3 Mark: ");
        int m3=sc.nextInt();
        
        System.out.println("Enter the Subect4 Mark: ");
        int m4=sc.nextInt();
        
        System.out.println("Enter the Subect5 Mark: ");
        int m5=sc.nextInt();
        
        int total=m1+m2+m3+m4+m5;
        System.out.println("Total- "+total);
        double per=(total/500.0)*100;
        System.out.println("The Percentage Of the Student Mark is : "+per+"%");
        
    }
}

