import java.util.Scanner;
public class percentage {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks of first subject : ");
        float a = sc.nextFloat();
        System.out.print("Enter marks of second subject : ");
        float b = sc.nextFloat();
        System.out.print("Enter marks of third subject : ");
        float c = sc.nextFloat();
        System.out.print("Enter marks of fourth subject : ");
        float d = sc.nextFloat();  
        System.out.print("Enter marks of fifth subject : ");
        float e = sc.nextFloat();  
        float percentage = (a+b+c+d+e)/5;
        System.out.print("Your final percentage is : ");
        System.out.println(percentage);    
    }
}