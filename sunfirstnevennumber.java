import java.util.Scanner;
public class sunfirstnevennumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many even number you want to add : ");
        int end = sc.nextInt();
        int sum = 0;
        for (int i=0; i<end; i++){
            sum = sum + (2*i);
        }
        System.out.print("Sum : "+sum);
    }
}