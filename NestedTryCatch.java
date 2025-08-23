import java.util.Scanner;
public class NestedTryCatch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []mark=new int[5];
        mark[0]=98;
        mark[1]=97;
        mark[2]=67;
        mark[3]=45;
        mark[4]=99;
        boolean flag=true;
        while(flag){
            try{
                System.out.println("Enter the index ");
                int index=sc.nextInt();
                try{
                    System.out.println("The vale of index is : "+mark[index]);
                    flag=false;
                }
                catch (ArrayIndexOutOfBoundsException e){
                    System.out.println("Enter the valid index");
                }
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
        System.out.println("The Code is Exit!!!");
    }
}
