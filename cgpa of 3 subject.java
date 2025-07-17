import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Mark Of Subject 1: ");
        float m1=sc.nextFloat();
        System.out.println("Enter the Mark Of Subject 2: ");
        float m2=sc.nextFloat();
        System.out.println("Enter the Mark Of Subject 3: ");
        float m3=sc.nextFloat();
        float cgpa=(m1+m2+m3)/30;
        System.out.println("The CGPA of Three Subject is : "+cgpa);
        
    }
}
