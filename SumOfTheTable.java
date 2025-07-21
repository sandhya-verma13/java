import java.util.Scanner;
public class SumOfTheTable{
    public static void main(String[] args){
        int n,sum=0;
        System.out.print("Enter the Table: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=10;i>=1;i--){
            System.out.printf("%d X %d = %d\n",n,i,n*i);
            sum+=n*i;
        }
        System.out.printf("Sum of the Table %d is :%d ",n,sum);
    }
}
