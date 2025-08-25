class NegativeRadiusException extends Exception{
    @Override
    public String toString(){
        return "Radius can not be negative";
    }
    @Override
    public String getMessage(){
        return "Radius not in radius!!! ";
    }
}
public class ThrowVsThrows {
    public static int divide(int a,int b) throws ArithmeticException{
        int result=a/b;
        return result;
    }
    public static double area(int r) throws NegativeRadiusException{
        if(r<0){
            throw new NegativeRadiusException();
        }
        double result=Math.PI*r*r;
        return result;
    }
    public static void main(String[] args) {
        try{
            //int c=divide(9,0);
            //System.out.println(c);
            double ar=area(-7);
            System.out.println("The Area is : " +ar);
        }
        catch(Exception e){
            System.out.println("Exception");
        }
    }
}
