import java.util.Scanner;
public class pattern6 {
    static void pattern(int rows){
        if (rows>0){
            pattern(rows-1);
            for(int i=0; i<rows; i++){
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
