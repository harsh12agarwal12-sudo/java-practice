import java.util.Scanner;
public class firstnnaturalnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many number you want to print : ");
        int end = sc.nextInt();
        int i = 1;
        do{
            System.out.println(i);
            i++;
        }while(i<=end);
    }
} 