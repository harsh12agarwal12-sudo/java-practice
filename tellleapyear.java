import java.util.Scanner;
public class tellleapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year : ");
        float year = sc.nextFloat();
        if (year%4==0){
            System.out.print("Leap year");
        }
        else {
            System.out.print("Not leap year");
        }
    }
}