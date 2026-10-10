import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number you want factorial of : ");
        int number = sc.nextInt();
        int product = 1;
        for (int i=number; i>0; i--){
            product = product*i;
        }
        System.out.print("Factorial of "+number+" is : "+product);
    }
}