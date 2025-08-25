import java.util.Scanner;

public class FinallyBlock {
    public static int he(){
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number1 : ");
            int a = sc.nextInt();
            System.out.print("Enter the number2 : ");
            int b = sc.nextInt();
            int c = a / b;
            return c;
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("The code is Exit......");
        }
        return 0;
    }
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter the number1 : ");
//        int a=sc.nextInt();
//        System.out.println("Enter the number2 : ");
//        int b=sc.nextInt();
//        int c=a/b;
        System.out.println(he());
        int a=7;
        int b=9;
        while (true){
            try{
                System.out.println(a/b);
            }
            catch (Exception e){
                System.out.println(e);
                break;
            }
            finally {
                System.out.println("Finally");
            }
            b--;
        }
    }
}
