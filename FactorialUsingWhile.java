import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int n,i=1,fact=1;
        System.out.print("Enter the Number: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(i<=n){
            fact*=i;
            i++;
        }
        System.out.printf("The Factorial of %d is : %d",n,fact);
    }
}
