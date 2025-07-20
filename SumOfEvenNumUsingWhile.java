import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int sum=0;
        int n;
        System.out.print("Enter How many even numbers you want to print: ");
        Scanner sc =new Scanner(System.in);
        n=sc.nextInt();
        int i=0;
        while(i<n){
            sum+=(2*i);
            i++;
        }
        System.out.printf("Sum of Even Number is : %d ",sum);
        
    }
}
