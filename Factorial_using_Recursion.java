public class Factorial_using_Recursion {
    static int factorial(int n){
        if(n==1 || n==0){
            return 1;
        }else{
            return n*factorial(n-1);
        }
    }
    public static void main(String[] args) {
        int a=5;
        System.out.println(factorial(a));

    }
}
