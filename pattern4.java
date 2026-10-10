import java.util.Scanner;
public class pattern4 {
    static void pattern(int rows){
        if (rows>0){
            for(int i=0; i<rows; i++){
                System.out.print("*");
            }
            System.out.print("\n");
            pattern(rows-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of line : ");
        int rows = sc.nextInt();
        pattern(rows);
    }
}