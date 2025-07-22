public class Using_function_pattern2 {
    static void pattern(int n){
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
