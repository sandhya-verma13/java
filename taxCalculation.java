import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        float tax=0;
        float income;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the income in lakhs: ");
        income=sc.nextFloat();
        if(income<2.5){
            tax=tax+0;
        }
        else if(income>=2.5f && income<=5f){
            tax=tax + 0.05f*(income - 2.5f);
        }
        else if(income>5f && income<=10.0f){
            tax=tax + 0.05f *(5.0f- 2.5f);
            tax=tax + 0.2f *(income- 5f);
        }
        else if(income>10.0f){
            tax=tax + 0.05f *(5f- 2.5f);
            tax=tax + 0.2f *(10.5f- 5f);
            tax=tax + 0.3f *(income- 10.0f);
        }
        System.out.println("The total taz is : "+ tax);
        
    }
}
