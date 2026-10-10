import java.util.Scanner;
public class firstnnaturalnumberreverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many natural number in reverse you want to print : ");
        int end = sc.nextInt();
        int i = end;
        for (i=end; i>0; i--){
            System.out.println(i);
        }
    }
}