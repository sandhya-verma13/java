import java .util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number 1: ");
        int a=sc.nextInt();
        System.out.println("Enter the Number 2: ");
        int b=sc.nextInt();
        System.out.println("Enter the Number 3: ");
        int c=sc.nextInt();
        int sum=a+b+c;
        System.out.println("The Sum Of Three Number is: "+sum);
    }
}
