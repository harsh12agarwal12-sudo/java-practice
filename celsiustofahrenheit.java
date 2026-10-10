import java.util.Scanner;
public class celsiustofahrenheit {
    static float celsiustofahrenheit(float ctemperature){
        float ftemperature = ctemperature*9/5+32;
        return ftemperature; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in celsius : ");
        float ctemperature = sc.nextFloat();
        System.out.print("Temperature in celsius is : "+celsiustofahrenheit(ctemperature));
    }
}