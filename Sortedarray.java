public class Sortedarray {
    public static void main(String[] args){
        boolean isShorted=true;
        int []arr={1,2,9,4,5};
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                isShorted=false;
                break;
            }
        }
        if(isShorted){
            System.out.println("The Array is Shorted");
        }else{
            System.out.println("The Array is Not Shorted");
        }
    }
}
