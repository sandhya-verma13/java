public class Maximumofarray {
    public static void main(String[] args){
        int []arr={1,2,3,4,5};
        int max=0;
        for(int e:arr){
            if(e>max){
                max=e;
            }
        }
        System.out.println(max);
    }
}
