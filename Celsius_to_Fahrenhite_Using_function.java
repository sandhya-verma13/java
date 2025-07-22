public class Celsius_to_Fahrenhite_Using_function {
    static float celsius_fah(float n){
        return (n*9/5+32);
    }
    //(0°C × 9/5) + 32
    public static void main(String[] args) {
        int c=23;
        System.out.println(celsius_fah(c));

    }
}
