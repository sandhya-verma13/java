import java.util.Scanner;
public class FactorialUsingFor{
    public static void main(String[] args){
        int n,fact=1;
        System.out.print("Enter the Number: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        System.out.printf("The Factorial of %d is : %d",n,fact);
    }
}
