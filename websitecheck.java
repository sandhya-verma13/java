import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        System.out.println("Enter the url: ");
        Scanner sc=new Scanner(System.in);
        String website=sc.next();
        if(website.endsWith(".com")){
            System.out.println("Commercial Website");
        }
        else if(website.endsWith(".org")){
            System.out.println("Organization Website");
            
        }else if(website.endsWith(".in")){
            System.out.println("Indian Website");
        }
    }
}
