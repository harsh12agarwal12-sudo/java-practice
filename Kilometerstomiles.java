import java.util.Scanner;
public class Kilometerstomiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in kilometers : ");
        float kilometers = sc.nextFloat();
        float miles = kilometers*0.6213712f;
        System.out.print("Distance in miles is : " + miles);
    }
}