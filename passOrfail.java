
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int s1,s2,s3;
        System.out.println("Enter 1st Subject Mark: ");
        s1=sc.nextInt();
        System.out.println("Enter 2nd Subject Mark: ");
        s2=sc.nextInt();
        System.out.println("Enter 3rd Subject Mark: ");
        s3=sc.nextInt();
        float avg=(s1+s2+s3)/3.0f;
        System.out.println("Average: "+avg);
        if(avg>=40 && s1>=33 && s2>=33 && s3>=33){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }
        
    }
}
