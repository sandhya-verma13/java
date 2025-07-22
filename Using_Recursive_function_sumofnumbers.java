public class Using_Recursive_function_sumofnumbers {
    static int sum(int n){
        if(n==1){
            return 1;
        }
        else{
            return n+sum(n-1);
        }
    }
    public static void main(String[] args) {
        int a=6;
        System.out.println(sum(a));
    }

}
