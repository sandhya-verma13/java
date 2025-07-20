import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Row: ");
        n=sc.nextInt();
        int i=n;
        while(i>0){
            int j=0;
            while(j<i){
                System.out.print("*");
                j++;
            }
            System.out.print("\n");
            i--;
        }
    }
}
