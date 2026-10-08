import java.util.Scanner;
public class CGPACalculation {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks of first subject : ");
        float a = sc.nextFloat();
        System.out.print("Enter marks of second sunject : ");
        float b = sc.nextFloat();
        System.out.print("Enter marks of third subject : ");
        float c = sc.nextFloat();
        float cgpa = (a+b+c)/30;
        System.out.print("Your final CGPA is : ");
        System.out.println(cgpa);
    }
}