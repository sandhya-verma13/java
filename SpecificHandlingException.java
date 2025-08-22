import java.util.Scanner;
public class SpecificHandlingException {
    public static void main(String[] args) {
        int [] mark=new int[5];
        mark[0]=90;
        mark[1]=98;
        mark[2]=99;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the index value that u want to divide ");
        int index=sc.nextInt();
        System.out.println("Enter the number you want to divide with index value");
        int num=sc.nextInt();
        try{
            System.out.println("The index value is "+mark[index]);
            int result=mark[index]/num;
            System.out.println("The Result is "+result);
        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticException Occured!!");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException Occured!!");
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println("Some other Exception Occured!!");
            System.out.println(e);
        }






    }
}
