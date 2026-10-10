import java.util.Scanner;
public class firstnoddnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many odd number you want to print : ");
        int end = sc.nextInt();
        int i = 1 ;
        for (i=1; i<=(end*2); i=i+2){
            System.out.println(i);
        }
    }
}  