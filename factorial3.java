import java .util.Scanner;
public class factorial3 {
    static int factorial(int number){
        if (number==0 || number==1){
            return 1;
        }
        else {
            return number * factorial(number - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number you want factorial of : ");
        int number = sc.nextInt();
        System.out.print("factorial of "+number+" is : "+factorial(number));
    }
}