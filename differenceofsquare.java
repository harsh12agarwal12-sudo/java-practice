import java.util.Scanner;
public class ch2qq3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of v : ");
        float v = sc.nextFloat();
        System.out.print("Enter the value of u : ");
        float u = sc.nextFloat();
        float equation = (v*v)-(u*u);
        System.out.print("Value of equation is : "+equation);
    }
}