import java.util.Scanner;
public class sumofmultiplicationtable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number you want table for sum : ");
        int number = sc.nextInt();
        System.out.print("Enter number of rows in table for sum : ");
        int rnumber = sc.nextInt();
        int sum = 0;
        for (int i=1; i<=rnumber; i++){
            sum = sum + (number*i);
        }
        System.out.print("Sum : "+sum);
    }
}