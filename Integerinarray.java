public class Integerinarray {
        public static void main(String[] args){
            float []marks={56.78f,67.45f,78.05f,89.05f,95.05f};
            float num=78.05f;
            boolean isInArray=false;
            for(float element:marks){
                if(num==element){
                    isInArray=true;
                    break;
                }
            }
            if(isInArray){
                System.out.println("The Number is Presented in the Array");
            }else{
                System.out.println("The Number is Not Presented in the Array");
            }
        }

}
