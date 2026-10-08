import java.util.Scanner;
public class converttolowercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter line which you want to convert in lower case : ");
        String line = sc.nextLine();
        System.out.println("line in lowercase : "+line.toLowerCase());
    }
}