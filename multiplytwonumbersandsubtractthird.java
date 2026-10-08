import java.util.Scanner;
public class ch2qq4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a : ");
        float a = sc.nextFloat();
        System.out.print("Enter value of b : ");
        float b = sc.nextFloat();
        System.out.print("Enter value of d : ");
        float d = sc.nextFloat();
        float equation = a*b-d;
        System.out.print("Value of this equation is : "+equation);
    }
}