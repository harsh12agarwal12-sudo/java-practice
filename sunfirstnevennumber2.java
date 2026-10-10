import java.util.Scanner;
public class sunfirstnevennumber2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many even number you want to add : ");
        int end = sc.nextInt();
        int i = 0;
        int sum = 0;
        while (i<end){
            sum = sum + (i*2);
            i++;
        }
        System.out.print("Sum : "+sum);
    }
}