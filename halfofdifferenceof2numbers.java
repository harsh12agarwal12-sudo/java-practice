import java.util.Scanner;
public class ch2qq1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of X : ");
        float x = sc.nextFloat();
        System.out.print("Enter the value of Y : ");
        float y = sc.nextFloat();
        float equation = (x-y)/2;
        System.out.print("Value of equation is : "+equation);
    }
}