import java.util.Scanner;
public class pattern3 {
    static void pattern(int rows){
        for (int i=1; i<=rows; i++){
            for (int j=i; j>0; j--){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of line : ");
        int rows = sc.nextInt();
        pattern(rows);
    }
}