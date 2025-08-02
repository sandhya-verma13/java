import java.util.Scanner;
import java.util.Random;
class Game{
    public int number;
    public int inputnumber;
    public int guessnum=0;


    public int getGuessnum() {
        return guessnum;
    }

    public void setGuessnum(int guessnum) {
        this.guessnum = guessnum;
    }

    Game(){
        Random r=new Random();
        this.number=r.nextInt(100);
    }
    void takeinput(){
        System.out.println("Enter the Number That you Guss!");
        Scanner sc=new Scanner(System.in);
        inputnumber=sc.nextInt();

    }
    boolean correct(){
        guessnum++;
        if(inputnumber==number){
            System.out.printf("You Guss The Correct Number %d\n At the Attempts %d ",number,guessnum);
            return true;
        }
        else if (inputnumber<number){
            System.out.println("Too Less....");
        }
        else if (inputnumber>number){
            System.out.println("Too High....");
        }
        return false;
    }
}
public class Guss_the_Number_OOPs {
    public static void main(String[] args) {
        System.out.println("Welcome To My Guss The Number Game !!!!!");
        Game g=new Game();
        boolean b=false;
        while(!b){
            g.takeinput();
            b=g.correct();
        }
    }
}
