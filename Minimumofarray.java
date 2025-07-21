public class Minimumofarray {
    public static void main(String[] args){
        int []arr={10,2,3,4,5};
        int min=Integer.MAX_VALUE;
        for(int e:arr){
            if(e<min){
                min=e;
            }
        }
        System.out.println(min);
    }
}
