import java.util.Scanner;
public class Kilometer_miles{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the KiloMeter : ");
        int k=sc.nextInt();
        double m=k*0.621371;
        System.out.println("Miles : "+m);
    }
}
