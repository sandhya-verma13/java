import java.util.Scanner;
public class TryCatch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        try{
            int c=a/b;
            System.out.println("The Result is : "+c);
        }
        catch (Exception e){
            System.out.println("Divided by zero is not possible");
            System.out.println(e);
        }
        System.out.println("Code Executed !!");
    }
}
