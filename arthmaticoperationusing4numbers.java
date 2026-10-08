import java.util.Scanner;
public class ch2q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of v : ");
        float v = sc.nextFloat();
        System.out.print("Enter the value of u : ");
        float u = sc.nextFloat();
        System.out.print("Enter the value of a : ");
        float a = sc.nextFloat();
        System.out.print("Enter the value of s : ");
        float s = sc.nextFloat();
        float equation = ((v*v)-(u*u))/(2*a*s);
        System.out.println("Answer of equation is : "+equation);
    }
}.