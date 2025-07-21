import java.util.Scanner;
public class Pattern1UsingForLoop{
    public static void main(String[] args){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Row: ");
        n=sc.nextInt();
        for(int i=n;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
