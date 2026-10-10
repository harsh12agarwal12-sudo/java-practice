import java.util.Scanner;
public class pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of line : ");
        int number = sc.nextInt();
        for (int i=number; i>0; i--){
            for (int j=i; j>0; j--){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}