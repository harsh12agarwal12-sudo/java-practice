import java.util.Scanner;
public class sumofarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many number you want to add : ");
        int tnumber = sc.nextInt();
        float sum = 0;
        float [] number = new float[tnumber];
        for (int i=0; i<tnumber; i++){
            System.out.print("Enter value of number "+(i+1)+" : ");
            float value = sc.nextFloat();
            number[i] = value;
            sum += value;
        }
        System.out.print("Sum : "+sum);
    }
}