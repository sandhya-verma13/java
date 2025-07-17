import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        System.out.println("Enter the Grade: ");
        Scanner sc=new Scanner(System.in);
        char grade=sc.next().charAt(0);
        grade=(char)(grade+8);
        System.out.println(grade);
    }
}
