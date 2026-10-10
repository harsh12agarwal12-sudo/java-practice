import java.util.Scanner;
public class doubleandtriplespace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter line in which you want to find 2 and 3 space : ");
        String line = sc.nextLine();
        System.out.print("Index of 2 space : "+line.indexOf("  ")+"\nIndex of 3 space : "+line.indexOf("   "));
    }
}