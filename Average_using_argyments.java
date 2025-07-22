public class Average_using_argyments {
    static float foo(int...arr){
//      int []arr;
        float result=0;
        for(int a:arr){
            result+=a;
        }
        return result/arr.length;

    }
    public static void main(String[] args) {
        System.out.println(foo(1,2,3,4));

    }
}
