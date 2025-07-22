public class Pattern_using_recursion {
    static void pattern(int n){
        if(n<=0){
            pattern(n-1);
        }
        for(int i=0;i<n;i++){
            for(int j=i;j<=n-1;j++){
                System.out.print("*"+" ");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        int a=4;
        pattern(a);

    }
}
