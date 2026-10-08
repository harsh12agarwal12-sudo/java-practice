import java.util.Scanner;
public class Greet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = sc.nextLine();
        System.out.print("Hello ");
        System.out.print(name);
        System.out.print(" , have a good day");
    }
}