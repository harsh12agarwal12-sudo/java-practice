import java.util.Scanner;
public class ch2qq2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a : ");
        float a = sc.nextFloat();
        System.out.print("Enter value of b : ");
        float b = sc.nextFloat();
        System.out.print("Enter value of c : ");
        float c = sc.nextFloat();
        float equation = ((b*b)-(4*a*c))/(2*a);
        System.out.print("Value of equation is : "+equation);
    }
}                                                        