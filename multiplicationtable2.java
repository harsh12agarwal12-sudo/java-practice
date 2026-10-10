import java.util.Scanner;
public class multiplicationtable2 {
    static void multiplicationtable(int number, int rows){
        for (int i=1; i<=rows; i++){
            System.out.println(number+" X "+i+" = "+(number*i));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number you want table of : ");
        int number = sc.nextInt();
        System.out.print("Enter numbers of rows you want in table : ");
        int rows = sc.nextInt();
        multiplicationtable(number,rows);
    }
}
