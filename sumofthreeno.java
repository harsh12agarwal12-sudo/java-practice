import java.util.Scanner;                                                                                                                           
public class sumofthreeno{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        float a = sc.nextFloat();
        System.out.print("Enter second number : ");
        float b = sc.nextFloat();
        System.out.print("Enter third number : ");
        float c = sc.nextFloat();
        float add = a+b+c;
        System.out.print("Sum of three number is : ");
        System.out.println(add);
    }
}