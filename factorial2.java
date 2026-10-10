import java.util.Scanner;
public class factorial2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number you want factorial of : ");
        int number = sc.nextInt();
        int product = 1;
        int i = number;
        while (i>0){
            product = product * i;
            i--;
        }
        System.out.print("Factorial of "+number+" is : "+product);
    }
}