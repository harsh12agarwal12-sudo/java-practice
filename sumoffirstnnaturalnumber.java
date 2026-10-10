import java.util.Scanner;
public class sumoffirstnnaturalnumber {
    static int sum(int number){
        if (number == 0){
            return 0;
        }
        else {
            return number + sum(number-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number you want sum of : ");
        int number = sc.nextInt();
        System.out.print("Sum : "+sum(number));
    }
}