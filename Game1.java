import java.util.Random;
import java.util.Scanner;
public class Game1{
    public static void main(String[] args){
        System.out.println("Welcome to Game \"Rock Paper Scissor\"");
        int i=1;
        int c=0,u=0;
        while(i<=3){
            System.out.println("Enter  Rock as 1  Paper as 0  Scissor as 2");
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter Your Choice : ");
            int user=sc.nextInt();
            Random rd=new Random();
            int com=rd.nextInt(3);
            System.out.println("Computer Choice : "+com);
            if(user==1 && com==1 ||user==0 && com==0 || user==2 && com==2){
                System.out.println("Draw the Match");
            }else if(user==1 && com==0 || user==0 && com==2 ||user==2 && com==1){
                System.out.println("Computer Win's");
                c=c+1;
            }else if(user==1 && com==2 ||user==0 && com==1 ||user==2 && com==0){
                System.out.println("You Win's");
                u=u+1;
            }
            
           i++;
           
        }
        System.out.println("Over All Result Of The Game is: ");
        if(c>u){
            System.out.println("Computer Win's");
        }else if(u>c){
            System.out.println("You Win's");
        }else{
            System.out.println("Both Are Equals");
        }
        
    }
}
