public class Averageforeachloop {
    public static void main(String[] args){
         float []marks={56.78f,67.45f,78.05f,89.05f,95.05f};
         float sum=0;
         float avg;
         for(float element:marks){
             sum=sum+element;
         }
         System.out.print("The Average Mark of Nmbers is: "+sum/marks.length);
    }
}
