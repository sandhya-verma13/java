public class Using_function_pattern {
    static void pattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
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
