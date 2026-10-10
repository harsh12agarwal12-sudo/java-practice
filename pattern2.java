import java.util.Scanner;
public class pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines : ");
        int number = sc.nextInt();
        int i = number;
        while (i>0){
            int j = i;
            while (j>0){
                System.out.print("*");
                j--;
            }
            System.out.print("\n");
            i--;
        }
    }
}