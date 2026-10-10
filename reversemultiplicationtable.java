import java.util.Scanner;
public class reversemultiplicationtable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number you want table of : ");
        int number = sc.nextInt();
        System.out.print("Enter number of rows : ");
        int rnumber = sc.nextInt();
        for (int i=rnumber; i>0; i--){
            System.out.println(number+" X "+i+" = "+(number*i));
        }
    }
}