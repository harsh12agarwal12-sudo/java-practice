import java.util.Scanner;
public class replacespacewithunderscore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter line in which you want to replace spaces with underscore : ");
        String line = sc.nextLine();
        System.out.print("line with underscore : "+line.replace(" ","_"));
    }
}   