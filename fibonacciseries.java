import java.util.Scanner;
public class fibonacciseries {
    static int series(int terms){
        if (terms==1 || terms==2){
            return terms-1;
        }
        else {
            return series(terms-1) + series(terms-2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms you want : ");
        int terms = sc.nextInt();
        System.out.print(series(terms));
    }
}