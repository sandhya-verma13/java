import java.util.Scanner;
public class TableInReverse{
    public static void main(String[] args){
        int n;
        System.out.print("Enter the Table: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=10;i>=1;i--){
            System.out.printf("%d X %d = %d\n",n,i,n*i);
        }
    }
}
