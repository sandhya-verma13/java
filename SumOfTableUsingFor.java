import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int sum=0,n;
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter How many even numbers you want to print: ");
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            sum=sum+(2*i);
        }
        System.out.print("The Sum of Even Number is : "+sum);
    }
}
